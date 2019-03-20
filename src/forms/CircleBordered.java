/**
 * @file CircleBordered.java
 * @authors Lagha Oussama & Robel Teklehaimanot
 * @date 10.03.2019
 */
package forms;

import view.Bouncable;
import view.Renderable;

import java.awt.*;

/**
 * Classe représentant tout les cercles avec bord
 */
public class CircleBordered extends Circle {
    public CircleBordered() {
        super();
        this.color = Color.green;
    }

    /**
     * permet de créer un cercle avec bord
     * @return renderable
     */
    @Override
    public Renderable getRenderer() {
        return new Renderable() {

            @Override
            public void display(Graphics2D g, Bouncable b) {
                g.setStroke(new BasicStroke(2));
                g.setColor(b.getColor());
                g.draw(b.getShape());

            }
        };
    }

}
