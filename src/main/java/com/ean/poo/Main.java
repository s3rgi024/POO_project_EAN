package com.ean.poo;

import com.ean.poo.view.GameWindow;
import javax.swing.SwingUtilities;

/**
 * Punto de entrada del juego del ahorcado
 */
public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                GameWindow window = new GameWindow();
                window.setVisible(true);
            }
        });
    }
}
