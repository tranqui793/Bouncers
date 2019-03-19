/**
 * @file Bouncable.java
 * @authors Lagha Oussama & Robel
 * @date 10.03.2019
 */
package view;

import java.awt.*;

public interface Bouncable {
    /**
     * permet de dessiner les bouncable
     */
    void draw();

    void move();

    Renderable getRenderer();

    Color getColor();

    Shape getShape();

}
