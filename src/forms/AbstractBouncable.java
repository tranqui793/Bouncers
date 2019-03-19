/**
 * @file AbstractBouncable.java
 * @authors Lagha Oussama & Robel
 * @date 10.03.2019
 */
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
    private final int SIZE_BOUnCABLE_MAX = 35;
    private final int SIZE_BOUNCABLE_MIN = 5;
    private static final Random rand = new Random();
    private int radius = rand.nextInt(SIZE_BOUnCABLE_MAX) + SIZE_BOUNCABLE_MIN;
    private static final BoucableSingleton display = BoucableSingleton.getInstance();

    public AbstractBouncable() {
        bouncableCoordinate = new Point(rand.nextInt(display.getWidth() - radius), rand.nextInt(display.getHeight() - radius));
        size = radius;
        speed = rand.nextInt(SIZE_BOUNCABLE_MIN);
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
