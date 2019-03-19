/**
 * @file SquareFilled.java
 * @authors Lagha Oussama & Robel
 * @date 10.03.2019
 */
package forms;

import view.Bouncable;
import view.Renderable;
import view.RenderableFill;

import java.awt.*;
import java.awt.geom.Rectangle2D;

public class SquareFilled extends Square {
    public SquareFilled() {
        super(new RenderableFill());
        this.color = Color.orange;
    }
}
