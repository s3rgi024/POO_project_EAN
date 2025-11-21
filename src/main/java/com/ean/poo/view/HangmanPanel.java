package com.ean.poo.view;

import javax.swing.*;
import java.awt.*;

/**
 * Panel que dibuja el ahorcado progresivamente según los errores
 */
public class HangmanPanel extends JPanel {
    private int wrongAttempts;
    private boolean gameLost;

    public HangmanPanel() {
        wrongAttempts = 0;
        gameLost = false;
        setPreferredSize(new Dimension(400, 500));
        setBackground(new Color(45, 45, 45));
        setBorder(BorderFactory.createLineBorder(new Color(80, 80, 80), 2));
    }

    public void setWrongAttempts(int attempts) {
        this.wrongAttempts = attempts;
        repaint();
    }

    public void setGameLost(boolean lost) {
        this.gameLost = lost;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setStroke(new BasicStroke(3));
        
        drawBase(g2d);
        
        if (wrongAttempts >= 1) drawHead(g2d);
        if (wrongAttempts >= 2) drawBody(g2d);
        if (wrongAttempts >= 3) drawRightArm(g2d);
        if (wrongAttempts >= 4) drawLeftArm(g2d);
        if (wrongAttempts >= 5) drawRightLeg(g2d);
        if (wrongAttempts >= 6) drawLeftLeg(g2d);
        if (wrongAttempts >= 7) drawRope(g2d);
    }

    private void drawBase(Graphics2D g) {
        g.setColor(new Color(180, 120, 70));
        g.fillRect(50, 430, 250, 15);
        g.fillRect(100, 100, 12, 330);
        g.fillRect(100, 100, 150, 12);
        g.fillRect(240, 100, 6, 50);
    }

    private void drawHead(Graphics2D g) {
        g.setColor(new Color(255, 200, 100));
        g.drawOval(213, 150, 60, 60);
        
        if (gameLost) {
            g.setStroke(new BasicStroke(2));
            g.drawLine(223, 168, 231, 176);
            g.drawLine(231, 168, 223, 176);
            g.drawLine(248, 168, 256, 176);
            g.drawLine(256, 168, 248, 176);
            g.setStroke(new BasicStroke(3));
            g.drawOval(233, 185, 20, 20);
        } else {
            g.fillOval(225, 170, 8, 8);
            g.fillOval(250, 170, 8, 8);
            g.drawArc(225, 180, 30, 20, 0, -180);
        }
    }

    private void drawBody(Graphics2D g) {
        g.setColor(new Color(255, 200, 100));
        g.drawLine(243, 210, 243, 310);
    }

    private void drawRightArm(Graphics2D g) {
        g.setColor(new Color(255, 200, 100));
        g.drawLine(243, 230, 200, 280);
    }

    private void drawLeftArm(Graphics2D g) {
        g.setColor(new Color(255, 200, 100));
        g.drawLine(243, 230, 286, 280);
    }

    private void drawRightLeg(Graphics2D g) {
        g.setColor(new Color(255, 200, 100));
        g.drawLine(243, 310, 210, 390);
    }

    private void drawLeftLeg(Graphics2D g) {
        g.setColor(new Color(255, 200, 100));
        g.drawLine(243, 310, 276, 390);
    }

    private void drawRope(Graphics2D g) {
        g.setColor(new Color(255, 80, 80));
        g.setStroke(new BasicStroke(5));
        g.drawLine(243, 100, 243, 150);
        
        int[] xPoints = {238, 243, 248};
        int[] yPoints = {85, 100, 85};
        g.fillPolygon(xPoints, yPoints, 3);
    }
}
