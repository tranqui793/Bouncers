package forms;

import view.Bouncable;

import java.awt.*;
import java.awt.geom.Rectangle2D;

public class SquareFilled extends AbstractBouncable {
    public SquareFilled() {
        super();
        this.color = Color.orange;
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
        return new Rectangle2D.Double(p.x, p.y, getSize(), getSize());
    }
}
