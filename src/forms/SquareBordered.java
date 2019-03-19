/**
 * @file SquareBordered.java
 * @authors Lagha Oussama & Robel
 * @date 10.03.2019
 */
package forms;

import view.Bouncable;
import view.Renderable;

import java.awt.*;
import java.awt.geom.Rectangle2D;

public class SquareBordered extends AbstractBouncable {
    public SquareBordered() {
        super();
        this.color = Color.red;
    }

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

    @Override
    public Shape getShape() {
        Point p = getBouncableCoordinate();
        return new Rectangle2D.Double(p.x, p.y, getSize(), getSize());
    }
}
