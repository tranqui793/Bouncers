/**
 * @file Square.java
 * @authors Lagha Oussama & Robel Teklehaimanot
 * @date 10.03.2019
 */
package forms;

import java.awt.*;
import java.awt.geom.Rectangle2D;

/**
 * Classe abstraite représentant tout les carrées
 */
public abstract class Square extends AbstractBouncable {

    /**
     * permet de créer la forme
     * @return une forme
     */
    @Override
    public Shape getShape() {
        Point p = getBouncableCoordinate();
        return new Rectangle2D.Double(p.x, p.y, getSize(), getSize());
    }
}
