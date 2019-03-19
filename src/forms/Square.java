/**
 * @file Square.java
 * @authors Lagha Oussama & Robel Teklehaimanot
 * @date 10.03.2019
 */

package forms;

import view.Renderable;

import java.awt.*;
import java.awt.geom.Rectangle2D;

public abstract class Square extends AbstractBouncable {


    public Square(Renderable r){
        super(r);
    }

    @Override
    public Shape getShape() {
        Point p = getBouncableCoordinate();
        return new Rectangle2D.Double(p.x, p.y, getSize(), getSize());
    }
}
