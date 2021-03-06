/**
 * @file Circle .java
 * @authors Lagha Oussama & Robel Teklehaimanot
 * @date 10.03.2019
 */
package forms;

import java.awt.*;
import java.awt.geom.Ellipse2D;

/**
 * Classe abstraite représentant tout les cercles
 */
public abstract class Circle extends AbstractBouncable {

    /**
     * permet de créer la forme
     * @return une forme
     */
    @Override
    public Shape getShape() {
        Point p = getBouncableCoordinate();
        return new Ellipse2D.Double(p.x, p.y, getSize(), getSize());
    }
}
