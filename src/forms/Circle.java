package forms;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public abstract class Circle extends AbstractBouncable {
    @Override
    public Shape getShape() {
        Point p = getBouncableCoordinate();
        return new Ellipse2D.Double(p.x, p.y, getSize(), getSize());
    }
}
