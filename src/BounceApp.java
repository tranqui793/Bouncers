import java.util.LinkedList;

public class BounceApp {
    private LinkedList<Bouncable> bouncers = new LinkedList<>();
    private static final BoucableSingleton bou = BoucableSingleton.getInstance();

    // Autres attributs
    public BounceApp() {

    }

    public void loop() {
        for (int i = 0; i < 20; i++) {
            bouncers.add(new CircleBordered());
            bouncers.add(new SquareBordered());
            bouncers.add(new CircleFilled());
            bouncers.add(new SquareFilled());
        }
        while (true) {
            for (int i = 0; i < bouncers.size(); i++) {
                bouncers.get(i).move();
                bouncers.get(i).draw();
            }
            bou.repaint();
        }
    }

    public static void main(String... args) {

        new BounceApp().loop();
    }
}
