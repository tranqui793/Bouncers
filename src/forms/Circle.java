package forms;

import view.Renderable;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public abstract class Circle extends AbstractBouncable{

    public Circle(Renderable r){
        super(r);
    }
    @Override
    public Shape getShape() {
        Point p = getBouncableCoordinate();
        return new Ellipse2D.Double(p.x, p.y, getSize(), getSize());
    }
}