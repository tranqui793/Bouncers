/**
 * @file SquareBordered.java
 * @authors Lagha Oussama & Robel
 * @date 10.03.2019
 */
package forms;

import view.Bouncable;
import view.Renderable;
import view.RenderableBordered;

import java.awt.*;
import java.awt.geom.Rectangle2D;

public class SquareBordered extends Square {
    public SquareBordered() {
        super(new RenderableBordered());
        this.color = Color.red;
    }
}
