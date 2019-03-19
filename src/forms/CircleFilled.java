/**
 * @file CircleFilled.java
 * @authors Lagha Oussama & Robel
 * @date 10.03.2019
 */
package forms;

import view.Bouncable;
import view.Renderable;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class CircleFilled extends AbstractBouncable {
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

    @Override
    public Shape getShape() {
        Point p = getBouncableCoordinate();
        return new Ellipse2D.Double(p.x, p.y, getSize(), getSize());
    }
}
