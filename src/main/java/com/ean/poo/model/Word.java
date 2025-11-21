package com.ean.poo.model;

/**
 * Representa una palabra del juego con su categoría y pista
 */
public class Word {
    private String text;
    private String category;
    private String hint;

    public Word(String text, String category, String hint) {
        this.text = text.toUpperCase();
        this.category = category;
        this.hint = hint;
    }

    public String getText() {
        return text;
    }

    public String getCategory() {
        return category;
    }

    public String getHint() {
        return hint;
    }

    public int getLength() {
        return text.length();
    }

    /**
     * Verifica si la palabra contiene una letra
     * 
     * @param letter La letra a buscar
     * @return true si la letra está en la palabra
     */
    public boolean containsLetter(char letter) {
        return text.indexOf(Character.toUpperCase(letter)) >= 0;
    }
}
