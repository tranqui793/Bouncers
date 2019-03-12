import java.awt.*;
import java.util.Random;

public abstract class AbstractBouncable implements Bouncable{
    private int x,y;
    private Point bouncableCoordinate;

    private static final Random rand = new Random();
    private int radius =rand.nextInt(35) + 5;
    private static final BoucableSingleton display=BoucableSingleton.getInstance();

    public AbstractBouncable(){
        bouncableCoordinate=new Point(rand.nextInt(display.getWidth() - radius), rand.nextInt(display.getHeight() - radius));
        while (x == 0 && y == 0) {
            this.x = rand.nextInt(4) - 1;
            this.y = rand.nextInt(4) - 1;
        }
    }
    @Override
    public void draw() {

    }

    @Override
    public void move() {

    }


}
