import java.util.LinkedList;

public class BounceApp
{
    private LinkedList<Bouncable> bouncers;
    private static final BoucableSingleton bou=BoucableSingleton.getInstance();
    // Autres attributs
    public BounceApp() {
        /* ... */
    }
    public void loop() {
        while(true)
        {
            for(int i=0;i<bouncers.size();i++)
            {
                bouncers.get(i).move();
                bouncers.get(i).draw();
            }
            bou.repaint();
        }
    }
    public static void main(String ... args) {
        new BounceApp().loop();
    }
}
