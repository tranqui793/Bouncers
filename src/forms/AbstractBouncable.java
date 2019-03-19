package forms;

import view.BoucableSingleton;
import view.Bouncable;

import java.awt.*;
import java.util.Random;

public abstract class AbstractBouncable implements Bouncable {
    private boolean x = false, y = false;
    private int size;
    private Point bouncableCoordinate;
    private int speed;
    protected Color color;

    private static final Random rand = new Random();
    private int radius = rand.nextInt(35) + 5;
    private static final BoucableSingleton display = BoucableSingleton.getInstance();

    public AbstractBouncable() {
        bouncableCoordinate = new Point(rand.nextInt(display.getWidth() - radius), rand.nextInt(display.getHeight() - radius));
        size = radius;
        speed = rand.nextInt(5);
    }

    @Override
    public void draw() {
        getRenderer().display(display.getGraphics(), this);
    }

    @Override
    public void move() {
        int oldX = bouncableCoordinate.x;
        int oldY = bouncableCoordinate.y;

        if (oldX < 1) {
            x = false;
        }
        if (oldX > display.getWidth() - radius) {
            x = true;
        }

        if (oldY < 1) {
            y = false;
        }
        if (oldY > display.getHeight() - radius) {
            y = true;
        }
        if (!x) {
            bouncableCoordinate.x = ++oldX + speed;
        } else {
            bouncableCoordinate.x = --oldX - speed;

        }
        if (!y) {
            bouncableCoordinate.y = ++oldY + speed;
        } else {
            bouncableCoordinate.y = --oldY - speed;

        }
    }

    @Override
    public Color getColor() {
        return color;
    }

    public Point getBouncableCoordinate() {
        return bouncableCoordinate;
    }

    public int getSize() {
        return size;
    }
}
