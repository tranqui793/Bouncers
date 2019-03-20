/**
 * @file SquareBordered.java
 * @authors Lagha Oussama & Robel Teklehaimanot
 * @date 10.03.2019
 */
package forms;

import view.Bouncable;
import view.Renderable;

import java.awt.*;

/**
 * Classe représentant tout les carrés avec bord
 */
public class SquareBordered extends Square {
    public SquareBordered() {
        super();
        this.color = Color.red;
    }

    /**
     * permet de créer un carré avec bord
     * @return renderable
     */
    @Override
    public Renderable getRenderer() {
        return new Renderable() {

            @Override
            public void display(Graphics2D g, Bouncable b) {
                g.setStroke(new BasicStroke(1));
                g.setColor(b.getColor());
                g.draw(b.getShape());

            }
        };
    }

}
