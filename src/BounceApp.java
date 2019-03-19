import factorys.AbstractFactory;
import factorys.EmptyFactory;
import factorys.FilledFactory;
import forms.*;
import view.BoucableSingleton;
import view.Bouncable;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.LinkedList;

public class BounceApp {
    private LinkedList<Bouncable> bouncers = new LinkedList<>();
    private static final BoucableSingleton bou = BoucableSingleton.getInstance();

    // Autres attributs
    public BounceApp() {
        bou.setTitle("BOUNCERS");
        bou.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent keyEvent) {
                switch (keyEvent.getKeyCode()) {
                    case KeyEvent.VK_E:
                        bouncers.clear();
                        break;
                    case KeyEvent.VK_B:
                        createBouncers(EmptyFactory.getInstance());
                        break;
                    case KeyEvent.VK_F:
                        createBouncers(FilledFactory.getInstance());
                        break;
                    case KeyEvent.VK_Q:
                       System.exit(0);
                       break;

                }
            }
        });

    }

    public void createBouncers(AbstractFactory factory) {
        for (int i = 0; i < 10; i++) {
            bouncers.add(factory.getCircle());
            bouncers.add(factory.getSquare());

        }
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
