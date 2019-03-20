/**
 * @file CircleFilled.java
 * @authors Lagha Oussama & Robel Teklehaimanot
 * @date 10.03.2019
 */
package forms;

import view.Bouncable;
import view.Renderable;

import java.awt.*;

public class CircleFilled extends Circle {
    public CircleFilled() {
        super();
        this.color = Color.blue;
    }

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
