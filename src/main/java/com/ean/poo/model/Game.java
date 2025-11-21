package com.ean.poo.model;

import java.util.ArrayList;
import java.util.Random;

/**
 * Controla la lógica del juego del ahorcado
 */
public class Game {
    private static final int MAX_ATTEMPTS = 7;
    private static final int TOTAL_HINTS = 3;
    
    private Word currentWord;
    private ArrayList<Character> guessedLetters;
    private ArrayList<Character> wrongLetters;
    private int remainingAttempts;
    private int availableHints;
    private boolean categoryHintUsed;
    private boolean letterHintUsed;
    private boolean textHintUsed;
    private boolean gameOver;
    private boolean won;
    private WordBank wordBank;
    private Random random;

    public Game() {
        wordBank = new WordBank();
        random = new Random();
        guessedLetters = new ArrayList<>();
        wrongLetters = new ArrayList<>();
        startNewGame();
    }

    public void startNewGame() {
        setCurrentWord(wordBank.getRandomWord());
    }

    public void setCurrentWord(Word word) {
        this.currentWord = word;
        guessedLetters.clear();
        wrongLetters.clear();
        remainingAttempts = MAX_ATTEMPTS;
        availableHints = TOTAL_HINTS;
        categoryHintUsed = false;
        letterHintUsed = false;
        textHintUsed = false;
        gameOver = false;
        won = false;
    }

    /**
     * Intenta adivinar una letra
     * 
     * @param letter La letra a adivinar
     * @return true si la letra está en la palabra
     */
    public boolean tryLetter(char letter) {
        letter = Character.toUpperCase(letter);
        
        if (guessedLetters.contains(letter) || wrongLetters.contains(letter)) {
            return false;
        }
        
        if (currentWord.containsLetter(letter)) {
            guessedLetters.add(letter);
            checkVictory();
            return true;
        } else {
            wrongLetters.add(letter);
            remainingAttempts--;
            if (remainingAttempts <= 0) {
                gameOver = true;
                won = false;
            }
            return false;
        }
    }

    /**
     * Usa la pista de categoría
     * 
     * @return La categoría de la palabra, o null si ya se usó
     */
    public String useCategoryHint() {
        if (categoryHintUsed || availableHints <= 0) {
            return null;
        }
        categoryHintUsed = true;
        availableHints--;
        remainingAttempts--;
        if (remainingAttempts <= 0) {
            gameOver = true;
            won = false;
        }
        return currentWord.getCategory();
    }

    /**
     * Usa la pista de letra aleatoria
     * 
     * @return La letra revelada, o null si ya se usó
     */
    public Character useLetterHint() {
        if (letterHintUsed || availableHints <= 0) {
            return null;
        }
        
        ArrayList<Character> missingLetters = new ArrayList<>();
        String wordText = currentWord.getText();
        
        for (int i = 0; i < wordText.length(); i++) {
            char letter = wordText.charAt(i);
            if (!guessedLetters.contains(letter)) {
                if (!missingLetters.contains(letter)) {
                    missingLetters.add(letter);
                }
            }
        }
        
        if (missingLetters.isEmpty()) {
            return null;
        }
        
        letterHintUsed = true;
        availableHints--;
        remainingAttempts--;
        if (remainingAttempts <= 0) {
            gameOver = true;
            won = false;
        }
        
        int randomIndex = random.nextInt(missingLetters.size());
        char revealedLetter = missingLetters.get(randomIndex);
        guessedLetters.add(revealedLetter);
        checkVictory();
        
        return revealedLetter;
    }

    /**
     * Usa la pista de texto
     * 
     * @return La pista escrita, o null si ya se usó
     */
    public String useTextHint() {
        if (textHintUsed || availableHints <= 0) {
            return null;
        }
        textHintUsed = true;
        availableHints--;
        remainingAttempts--;
        if (remainingAttempts <= 0) {
            gameOver = true;
            won = false;
        }
        return currentWord.getHint();
    }

    private void checkVictory() {
        String wordText = currentWord.getText();
        for (int i = 0; i < wordText.length(); i++) {
            char letter = wordText.charAt(i);
            if (!guessedLetters.contains(letter)) {
                return;
            }
        }
        gameOver = true;
        won = true;
    }

    public String getWordWithBlanks() {
        StringBuilder result = new StringBuilder();
        String wordText = currentWord.getText();
        
        for (int i = 0; i < wordText.length(); i++) {
            char letter = wordText.charAt(i);
            if (guessedLetters.contains(letter)) {
                result.append(letter);
            } else {
                result.append("_");
            }
            if (i < wordText.length() - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public boolean hasWon() {
        return won;
    }

    public int getRemainingAttempts() {
        return remainingAttempts;
    }

    public int getWrongAttemptsCount() {
        return MAX_ATTEMPTS - remainingAttempts;
    }

    public ArrayList<Character> getWrongLetters() {
        return new ArrayList<>(wrongLetters);
    }

    public Word getCurrentWord() {
        return currentWord;
    }

    public int getAvailableHints() {
        return availableHints;
    }

    public boolean isCategoryHintUsed() {
        return categoryHintUsed;
    }

    public boolean isLetterHintUsed() {
        return letterHintUsed;
    }

    public boolean isTextHintUsed() {
        return textHintUsed;
    }

    public int getTotalDrawnParts() {
        int hintsUsed = TOTAL_HINTS - availableHints;
        return getWrongAttemptsCount() + hintsUsed;
    }

    public void setRemainingAttempts(int attempts) {
        this.remainingAttempts = attempts;
    }

    public void setAvailableHints(int hints) {
        this.availableHints = hints;
    }
}
