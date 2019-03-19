package view;

import java.awt.*;

public class RenderableFill implements Renderable{
    @Override
    public void display(Graphics2D g, Bouncable b) {
        g.setColor(b.getColor());
        g.fill(b.getShape());
    }
}
