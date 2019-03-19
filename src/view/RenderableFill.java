/**
 * @file RenderableFill.java
 * @authors Lagha Oussama & Robel Teklehaimanot
 * @date 10.03.2019
 */

package view;

import java.awt.*;

public class RenderableFill implements Renderable{
    @Override
    public void display(Graphics2D g, Bouncable b) {
        g.setColor(b.getColor());
        g.fill(b.getShape());
    }
}
