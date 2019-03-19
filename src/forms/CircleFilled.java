/**
 * @file CircleFilled.java
 * @authors Lagha Oussama & Robel
 * @date 10.03.2019
 */
package forms;

import view.Bouncable;
import view.Renderable;
import view.RenderableFill;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class CircleFilled extends Circle {
    public CircleFilled() {
        super(new RenderableFill());
        this.color = Color.blue;
    }
}
