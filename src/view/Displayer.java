/**
 * @file Displayer.java
 * @authors Lagha Oussama & Robel
 * @date 10.03.2019
 */
package view;

import java.awt.*;
import java.awt.event.KeyAdapter;

public interface Displayer {
    /**
     * permet de recuperer le width de notre jpanel
     *
     * @return le width de la Jpanel
     */
    int getWidth();

    /**
     * permet de recuperer le heigth de notre jpanel
     *
     * @return le height de la Jpanel
     */

    int getHeight();

    /**
     * permet de recuperer le Graphique en 2D
     *
     * @return le Graphique cree pour la frame
     */

    Graphics2D getGraphics();

    /**
     * dessine la Frame
     */

    void repaint();

    /**
     * permet d'attribue le titre de la frame
     *
     * @param s titre de la Frame
     */

    void setTitle(String s);

    /**
     * permet d'ajouter un keylistener a la frame
     *
     * @param ka le keyListener a ajouter
     */

    void addKeyListener(KeyAdapter ka);

}
