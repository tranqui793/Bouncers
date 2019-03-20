/**
 * @file CircleFilled.java
 * @authors Lagha Oussama & Robel Teklehaimanot
 * @date 10.03.2019
 */
package forms;

import view.Bouncable;
import view.Renderable;

import java.awt.*;

/**
 * Classe représentant tout les cercles remplis
 */
public class CircleFilled extends Circle {
    public CircleFilled() {
        super();
        this.color = Color.blue;
    }

    /**
     * permet de créer un cercle avec rempli
     * @return renderable
     */
    @Override
    public Renderable getRenderer() {
        return new Renderable() {

            @Override
            public void display(Graphics2D g, Bouncable b) {
                g.setColor(b.getColor());
                g.fill(b.getShape());

            }
        };
    }

}
