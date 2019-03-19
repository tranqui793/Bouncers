/**
 * @file CircleBordered.java
 * @authors Lagha Oussama & Robel Teklehaimanot
 * @date 10.03.2019
 */
package forms;

import view.Bouncable;
import view.Renderable;
import view.RenderableBordered;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class CircleBordered extends Circle {
    public CircleBordered() {
        super(new RenderableBordered());
        this.color = Color.green;
    }

}
