package com.ean.poo.view;

import com.ean.poo.model.Game;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameWindow extends JFrame {
    private Game game;
    private HangmanPanel hangmanPanel;
    private JLabel wordLabel;
    private JLabel attemptsLabel;
    private JLabel wrongLettersLabel;
    private JLabel hintsLabel;
    private JButton[] letterButtons;
    private JButton categoryHintButton;
    private JButton letterHintButton;
    private JButton textHintButton;
    private JButton newGameButton;
    private JTextArea infoArea;

    public GameWindow() {
        game = new Game();
        initializeComponents();
        updateInterface();
    }

    private void initializeComponents() {
        setTitle("Juego del Ahorcado - Proyecto POO");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));
        getContentPane().setBackground(new Color(30, 30, 30));

        JPanel centerPanel = new JPanel(new BorderLayout(10, 10));
        centerPanel.setOpaque(false);

        hangmanPanel = new HangmanPanel();
        centerPanel.add(hangmanPanel, BorderLayout.CENTER);

        JPanel infoPanel = createInfoPanel();
        centerPanel.add(infoPanel, BorderLayout.SOUTH);

        add(centerPanel, BorderLayout.CENTER);

        JPanel controlPanel = createControlPanel();
        add(controlPanel, BorderLayout.EAST);

        JPanel bottomPanel = createBottomPanel();
        add(bottomPanel, BorderLayout.SOUTH);

        setMinimumSize(new Dimension(750, 800));
        pack();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    private JPanel createInfoPanel() {
        JPanel panel = new JPanel(new GridLayout(4, 1, 5, 5));
        panel.setBackground(new Color(40, 40, 40));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        wordLabel = new JLabel("", SwingConstants.CENTER);
        wordLabel.setFont(new Font("Monospaced", Font.BOLD, 32));
        wordLabel.setForeground(new Color(100, 200, 255));

        attemptsLabel = new JLabel("", SwingConstants.CENTER);
        attemptsLabel.setFont(new Font("Arial", Font.BOLD, 16));
        attemptsLabel.setForeground(new Color(220, 220, 220));

        wrongLettersLabel = new JLabel("", SwingConstants.CENTER);
        wrongLettersLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        wrongLettersLabel.setForeground(new Color(255, 100, 100));

        hintsLabel = new JLabel("", SwingConstants.CENTER);
        hintsLabel.setFont(new Font("Arial", Font.BOLD, 14));
        hintsLabel.setForeground(new Color(100, 255, 150));

        panel.add(wordLabel);
        panel.add(attemptsLabel);
        panel.add(wrongLettersLabel);
        panel.add(hintsLabel);

        return panel;
    }

    private JPanel createControlPanel() {
        JPanel panel = new JPanel(new BorderLayout(5, 5));
        panel.setBackground(new Color(40, 40, 40));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JPanel hintsPanel = new JPanel(new GridLayout(4, 1, 5, 5));
        hintsPanel.setBackground(new Color(40, 40, 40));

        JLabel hintsTitle = new JLabel("PISTAS", SwingConstants.CENTER);
        hintsTitle.setFont(new Font("Arial", Font.BOLD, 16));
        hintsTitle.setForeground(new Color(255, 200, 100));
        hintsPanel.add(hintsTitle);

        categoryHintButton = new JButton("Categoría");
        categoryHintButton.setFont(new Font("Arial", Font.PLAIN, 12));
        categoryHintButton.setBackground(new Color(70, 130, 180));
        categoryHintButton.setForeground(Color.WHITE);
        categoryHintButton.setFocusPainted(false);
        categoryHintButton.setBorderPainted(false);
        categoryHintButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                useCategoryHint();
            }
        });
        hintsPanel.add(categoryHintButton);

        letterHintButton = new JButton("Revelar Letra");
        letterHintButton.setFont(new Font("Arial", Font.PLAIN, 12));
        letterHintButton.setBackground(new Color(70, 130, 180));
        letterHintButton.setForeground(Color.WHITE);
        letterHintButton.setFocusPainted(false);
        letterHintButton.setBorderPainted(false);
        letterHintButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                useLetterHint();
            }
        });
        hintsPanel.add(letterHintButton);

        textHintButton = new JButton("Pista de Texto");
        textHintButton.setFont(new Font("Arial", Font.PLAIN, 12));
        textHintButton.setBackground(new Color(70, 130, 180));
        textHintButton.setForeground(Color.WHITE);
        textHintButton.setFocusPainted(false);
        textHintButton.setBorderPainted(false);
        textHintButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                useTextHint();
            }
        });
        hintsPanel.add(textHintButton);

        panel.add(hintsPanel, BorderLayout.NORTH);

        infoArea = new JTextArea(15, 22);
        infoArea.setEditable(false);
        infoArea.setLineWrap(true);
        infoArea.setWrapStyleWord(true);
        infoArea.setFont(new Font("Arial", Font.PLAIN, 12));
        infoArea.setBackground(new Color(50, 50, 50));
        infoArea.setForeground(new Color(220, 220, 220));
        infoArea.setCaretColor(Color.WHITE);
        infoArea.setBorder(BorderFactory.createLineBorder(new Color(80, 80, 80)));
        JScrollPane scrollPane = new JScrollPane(infoArea);
        scrollPane.getViewport().setBackground(new Color(50, 50, 50));
        panel.add(scrollPane, BorderLayout.CENTER);

        newGameButton = new JButton("Reiniciar");
        newGameButton.setFont(new Font("Arial", Font.BOLD, 16));
        newGameButton.setBackground(new Color(46, 125, 50));
        newGameButton.setForeground(Color.WHITE);
        newGameButton.setFocusPainted(false);
        newGameButton.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(56, 142, 60), 2),
            BorderFactory.createEmptyBorder(10, 20, 10, 20)
        ));
        newGameButton.setPreferredSize(new Dimension(150, 45));
        newGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetGame();
            }
        });
        panel.add(newGameButton, BorderLayout.SOUTH);

        return panel;
    }

    private JPanel createBottomPanel() {
        JPanel panel = new JPanel(new BorderLayout(5, 5));
        panel.setBackground(new Color(40, 40, 40));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JPanel lettersPanel = createLetterButtons();
        panel.add(lettersPanel, BorderLayout.CENTER);

        return panel;
    }

    private JPanel createLetterButtons() {
        JPanel panel = new JPanel(new GridLayout(3, 9, 3, 3));
        panel.setBackground(new Color(40, 40, 40));
        letterButtons = new JButton[26];

        for (int i = 0; i < 26; i++) {
            char letter = (char) ('A' + i);
            JButton button = new JButton(String.valueOf(letter));
            button.setFont(new Font("Arial", Font.BOLD, 12));
            button.setBackground(new Color(60, 60, 60));
            button.setForeground(new Color(220, 220, 220));
            button.setFocusPainted(false);
            button.setBorderPainted(false);
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    handleLetterClick(letter);
                }
            });
            letterButtons[i] = button;
            panel.add(button);
        }

        return panel;
    }

    private void handleLetterClick(char letter) {
        if (game.isGameOver()) {
            return;
        }

        boolean correct = game.tryLetter(letter);
        disableLetterButton(letter);

        if (correct) {
            infoArea.append("¡Correcto! La letra " + letter + " está en la palabra.\n");
        } else {
            infoArea.append("¡Error! La letra " + letter + " no está en la palabra.\n");
        }

        updateInterface();

        if (game.isGameOver()) {
            if (game.hasWon()) {
                showVictoryMessage();
            } else {
                showDefeatMessage();
            }
        }
    }

    private void useCategoryHint() {
        String category = game.useCategoryHint();
        if (category != null) {
            infoArea.append("PISTA USADA: La categoría es " + category + "\n");
            infoArea.append("(Se dibujó una parte del ahorcado)\n");
            updateInterface();
        } else {
            JOptionPane.showMessageDialog(this, 
                "¡Pista ya usada o no hay pistas disponibles!", 
                "Pista", 
                JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void useLetterHint() {
        Character letter = game.useLetterHint();
        if (letter != null) {
            infoArea.append("PISTA USADA: ¡La letra " + letter + " ha sido revelada!\n");
            infoArea.append("(Se dibujó una parte del ahorcado)\n");
            disableLetterButton(letter);
            updateInterface();
            if (game.isGameOver() && game.hasWon()) {
                showVictoryMessage();
            }
        } else {
            JOptionPane.showMessageDialog(this, 
                "¡Pista ya usada o no hay pistas disponibles!", 
                "Pista", 
                JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void useTextHint() {
        String hint = game.useTextHint();
        if (hint != null) {
            infoArea.append("PISTA USADA: " + hint + "\n");
            infoArea.append("(Se dibujó una parte del ahorcado)\n");
            updateInterface();
        } else {
            JOptionPane.showMessageDialog(this, 
                "¡Pista ya usada o no hay pistas disponibles!", 
                "Pista", 
                JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void updateInterface() {
        wordLabel.setText(game.getWordWithBlanks());
        attemptsLabel.setText("Intentos restantes: " + game.getRemainingAttempts());
        hintsLabel.setText("Pistas disponibles: " + game.getAvailableHints());

        StringBuilder wrongLetters = new StringBuilder("Letras incorrectas: ");
        for (Character letter : game.getWrongLetters()) {
            wrongLetters.append(letter).append(" ");
        }
        wrongLettersLabel.setText(wrongLetters.toString());

        hangmanPanel.setWrongAttempts(game.getTotalDrawnParts());

        categoryHintButton.setEnabled(!game.isCategoryHintUsed() && game.getAvailableHints() > 0);
        letterHintButton.setEnabled(!game.isLetterHintUsed() && game.getAvailableHints() > 0);
        textHintButton.setEnabled(!game.isTextHintUsed() && game.getAvailableHints() > 0);
    }

    private void disableLetterButton(char letter) {
        int index = letter - 'A';
        if (index >= 0 && index < 26) {
            letterButtons[index].setEnabled(false);
        }
    }

    private void enableAllLetterButtons() {
        for (JButton button : letterButtons) {
            button.setEnabled(true);
        }
    }

    private void showVictoryMessage() {
        infoArea.append("\n=== ¡GANASTE! ===\n");
        infoArea.append("La palabra era: " + game.getCurrentWord().getText() + "\n");
        
        UIManager.put("OptionPane.background", new Color(50, 50, 50));
        UIManager.put("Panel.background", new Color(50, 50, 50));
        UIManager.put("OptionPane.messageForeground", Color.WHITE);
        UIManager.put("Button.background", Color.WHITE);
        UIManager.put("Button.foreground", Color.BLACK);
        
        Object[] options = {"Reiniciar"};
        JOptionPane.showOptionDialog(this,
            "¡Felicitaciones! ¡Ganaste!\nLa palabra era: " + game.getCurrentWord().getText(),
            "¡Victoria!",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.INFORMATION_MESSAGE,
            null,
            options,
            options[0]);
        
        resetGame();
    }

    private void showDefeatMessage() {
        hangmanPanel.setGameLost(true);
        infoArea.append("\n=== JUEGO TERMINADO ===\n");
        infoArea.append("La palabra era: " + game.getCurrentWord().getText() + "\n");
        
        UIManager.put("OptionPane.background", new Color(50, 50, 50));
        UIManager.put("Panel.background", new Color(50, 50, 50));
        UIManager.put("OptionPane.messageForeground", Color.WHITE);
        UIManager.put("Button.background", Color.WHITE);
        UIManager.put("Button.foreground", Color.BLACK);
        
        Object[] options = {"Reiniciar"};
        JOptionPane.showOptionDialog(this,
            "¡Juego Terminado!\nLa palabra era: " + game.getCurrentWord().getText(),
            "Derrota",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.ERROR_MESSAGE,
            null,
            options,
            options[0]);
        
        resetGame();
    }

    private void resetGame() {
        game.startNewGame();
        hangmanPanel.setGameLost(false);
        enableAllLetterButtons();
        infoArea.setText("");
        infoArea.append("¡Nuevo juego iniciado! ¡Buena suerte!\n");
        updateInterface();
    }
}

