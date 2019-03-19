package view;

import java.awt.*;

public class RenderableBordered implements Renderable{

    @Override
            public void display(Graphics2D g, Bouncable b) {
                g.setStroke(new BasicStroke(2));
                g.setColor(b.getColor());
                g.draw(b.getShape());
    }
}
