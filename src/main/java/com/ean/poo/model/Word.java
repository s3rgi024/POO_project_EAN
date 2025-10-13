package com.ean.poo.model;

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

    public boolean containsLetter(char letter) {
        return text.indexOf(Character.toUpperCase(letter)) >= 0;
    }
}

