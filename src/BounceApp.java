/**
 * @file BounceApp.java
 * @authors Lagha Oussama & Robel
 * @date 10.03.2019
 */

import factorys.AbstractFactory;
import factorys.EmptyFactory;
import factorys.FilledFactory;
import view.BoucableSingleton;
import view.Bouncable;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.LinkedList;


public class BounceApp {
    private LinkedList<Bouncable> bouncers = new LinkedList<>();//Listes des Bouncables
    private static final BoucableSingleton bou = BoucableSingleton.getInstance();
    private final int NB_BOUNCABLE_TO_CREATE = 10;

    // Autres attributs
    public BounceApp() {
        bou.setTitle("BOUNCERS");
        bou.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent keyEvent) {
                switch (keyEvent.getKeyCode()) {
                    case KeyEvent.VK_E:
                        synchronized (bouncers) {
                            bouncers.clear();
                        }
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

    /**
     * permet de cree 10 circle et 10 square
     * @param factory cree les Bouncables (des Filled ou des Bordered)
     */

    public void createBouncers(AbstractFactory factory) {
        for (int i = 0; i < NB_BOUNCABLE_TO_CREATE; i++) {
            bouncers.add(factory.getCircle());
            bouncers.add(factory.getSquare());

        }
    }
    /**
     * permet de cree 10 circle et 10 square et de bouger et les dessiner sans arret
     */
    public void loop() {
        createBouncers(EmptyFactory.getInstance());
        createBouncers(FilledFactory.getInstance());
        while (true) {
            synchronized (bouncers) {
                for (int i = 0; i < bouncers.size(); i++) {
                    bouncers.get(i).move();
                    bouncers.get(i).draw();
                }
            }
            bou.repaint();
        }
    }

    public static void main(String... args) {

        new BounceApp().loop();
    }
}
