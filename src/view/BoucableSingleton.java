package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.image.BufferedImage;

public class BoucableSingleton implements Displayer {
    private static final BoucableSingleton singletonInstance = new BoucableSingleton();

    private final JFrame bouncableFrame;
    private final JPanel bouncableJPanel;
    private BufferedImage bufImg;
    private final int PREFERED_SIZE_FRAME = 700;

    private BoucableSingleton() {
        bouncableFrame = new JFrame("Bouncers");
        bouncableJPanel = new JPanel();

        bouncableFrame.getContentPane().add(bouncableJPanel);
        bouncableFrame.setResizable(true);
        bouncableFrame.setMinimumSize(new Dimension(PREFERED_SIZE_FRAME, PREFERED_SIZE_FRAME));

        bouncableFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bouncableFrame.setVisible(true);
        bufImg = (BufferedImage) bouncableJPanel.createImage(PREFERED_SIZE_FRAME, PREFERED_SIZE_FRAME);
        bufImg.createGraphics().drawImage(bufImg, 0, 0, null);
        bouncableFrame.pack();

    }

    public static BoucableSingleton getInstance() {
        return singletonInstance;
    }

    @Override
    public int getWidth() {
        return bouncableJPanel.getWidth();
    }

    @Override
    public int getHeight() {
        return bouncableJPanel.getHeight();
    }

    @Override
    public Graphics2D getGraphics() {
        return (Graphics2D) bufImg.getGraphics();
    }

    @Override
    public void repaint() {

        bouncableJPanel.getGraphics().drawImage(bufImg, 0, 0, null);
        bufImg = (BufferedImage) bouncableJPanel.createImage(this.getWidth(), this.getHeight());
    }

    @Override
    public void setTitle(String s) {
        bouncableFrame.setTitle(s);
    }

    @Override
    public void addKeyListener(KeyAdapter ka) {
        bouncableFrame.addKeyListener(ka);
    }
}
