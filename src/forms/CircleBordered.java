package forms;

import view.Bouncable;
import view.Renderable;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class CircleBordered extends AbstractBouncable {
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

    @Override
    public Shape getShape() {
        Point p = getBouncableCoordinate();
        return new Ellipse2D.Double(p.x, p.y, getSize(), getSize());
    }
}
