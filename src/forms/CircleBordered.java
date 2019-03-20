/**
 * @file CircleBordered.java
 * @authors Lagha Oussama & Robel Teklehaimanot
 * @date 10.03.2019
 */
package forms;

import view.Bouncable;
import view.Renderable;

import java.awt.*;

public class CircleBordered extends Circle {
    public CircleBordered() {
        super();
        this.color = Color.green;
    }

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
