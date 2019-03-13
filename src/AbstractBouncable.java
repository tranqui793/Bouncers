import java.awt.*;
import java.util.Random;

public abstract class AbstractBouncable implements Bouncable{
    private int x,y,size;
    private Point bouncableCoordinate;
    protected Color color ;

    private static final Random rand = new Random();
    private int radius =rand.nextInt(35) + 5;
    private static final BoucableSingleton display=BoucableSingleton.getInstance();

    public AbstractBouncable(){
        bouncableCoordinate=new Point(rand.nextInt(display.getWidth() - radius), rand.nextInt(display.getHeight() - radius));
        size=radius;
        while (x == 0 && y == 0) {
            x = rand.nextInt(4) - 1;
            y = rand.nextInt(4) - 1;
        }
    }
    @Override
    public void draw() {
        getRenderer().display(display.getGraphics(),this);
    }

    @Override
    public void move() {

        int oldX = bouncableCoordinate.x;
        int oldY = bouncableCoordinate.y;

        if (oldX < 0) {
            x *= -1;
        }
        if (oldX > display.getWidth() - radius) {
            bouncableCoordinate.x -= (bouncableCoordinate.x + radius - display.getWidth());
            if (x != 0) {
                x *= -1;
            } else {
                x = -1;
            }
        }

        if (oldY < 0) {
            bouncableCoordinate.y -= (bouncableCoordinate.y);
            if (y != 0) {
                y *= -1;
            } else {
                y = -1;
            }
        }
        if (oldY > display.getHeight() - radius)
            while (x == 0 && y == 0) {
            this.x = rand.nextInt(4) - 1;
            this.y = rand.nextInt(4) - 1;
        } {
            bouncableCoordinate.y -= (bouncableCoordinate.y + radius - display.getHeight());
            if (y != 0) {
                y *= -1;
            } else {
                y = -1;
            }
        }
        bouncableCoordinate.x += x;
        bouncableCoordinate.y += y;
    }
    @Override
    public Color getColor(){
        return color;
    }

    public Point getBouncableCoordinate() {
        return bouncableCoordinate;
    }

    public int getSize() {
        return size;
    }
}
