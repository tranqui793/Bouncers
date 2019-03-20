/**
 * @file Bouncable.java
 * @authors Lagha Oussama & Robel Teklehaimanot
 * @date 10.03.2019
 */
package view;

import java.awt.*;

public interface Bouncable {
    /**
     * permet de dessiner les bouncable
     */
    void draw();

    /**
     * permet de deplacer les bouncable
     */

    void move();

    /**
     * permet de recuperer le Renderable
     * @return le Renderable de l'objet
     */

    Renderable getRenderer();

    /**
     * permet de recuperer la couleur du Bouncable
     * @return Couleur du bouncable
     */

    Color getColor();

    /**
     * permet de recupere la shape du bouncable
     * @return la forme de Bouncable
     */

    Shape getShape();

}
