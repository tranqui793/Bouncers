package forms;

import java.awt.*;
import java.awt.geom.Rectangle2D;

public abstract class Square extends AbstractBouncable {

    @Override
    public Shape getShape() {
        Point p = getBouncableCoordinate();
        return new Rectangle2D.Double(p.x, p.y, getSize(), getSize());
    }
}
