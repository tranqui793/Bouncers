/**
 * @file AbstractBouncable.java
 * @authors Lagha Oussama & Robel Teklehaimanot
 * @date 10.03.2019
 */
package forms;

import view.BoucableSingleton;
import view.Bouncable;
import java.awt.*;
import java.util.Random;

/**
 * classe representant un objet Bouncable
 */
public abstract class AbstractBouncable implements Bouncable {

    private final int SIZE_BOUnCABLE_MAX = 35;
    private final int SIZE_BOUNCABLE_MIN = 5;
    private static final Random rand = new Random();
    private static final BoucableSingleton display = BoucableSingleton.getInstance();//instance unique

    private boolean x = false, y = false;
    private Point bouncableCoordinate;//les coordonnees de l'objet
    private int speed;//la vitesse
    protected Color color;
    private int size = rand.nextInt(SIZE_BOUnCABLE_MAX) + SIZE_BOUNCABLE_MIN;

    public AbstractBouncable() {
        bouncableCoordinate = new Point(rand.nextInt(display.getWidth() - size), rand.nextInt(display.getHeight() - size));
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
        if (oldX > display.getWidth() - size) {
            x = true;
        }

        if (oldY < 1) {
            y = false;
        }
        if (oldY > display.getHeight() - size) {
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

    /**
     * permet de recupere les coordonnes de l'objets
     * @return un Point qui contient X et Y du Bouncable
     */

    public Point getBouncableCoordinate() {
        return bouncableCoordinate;
    }

    /**
     * permet de recupere la taille du Bouncable
     * @return la taille
     */

    public int getSize() {
        return size;
    }
}
