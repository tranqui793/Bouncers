/**
 * @file BounceApp.java
 * @authors Lagha Oussama & Robel Teklehaimanot
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

/**
 * classe creer une application graphique qui instancie des cercle et des caree pleins et vide ,10 de chaque a la fois
 * 'E' supprime tt les shapes
 * 'B' cree 10 carree et 10 cercle vide
 * 'F' cree 10 carree et 10 cercle pleins
 * 'Q' quite l'application
 *  les shapes rebondissent sur les bords
 */

public class BounceApp {
    private LinkedList<Bouncable> bouncers = new LinkedList<>();//Listes des Bouncables
    private static final BoucableSingleton bou = BoucableSingleton.getInstance();//represente la fenetre graphique
    private final int NB_BOUNCABLE_TO_CREATE = 10;

    // Constructeur
    public BounceApp() {
        bou.setTitle("BOUNCERS");
        bou.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent keyEvent) {
                switch (keyEvent.getKeyCode()) {
                    case KeyEvent.VK_E:
                        synchronized (bouncers) {//synchronized parceque si on a beaucoup de shapes on aura un accées
                            //concurrent dans la boucle infini le thread prend beaucoup du temps et si entre temps on
                            // appuie sur E l'application crash
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
     * permet de cree 10 circle et 10 square a l'aide de factory
     * @param factory utiliser pour cree les shapes
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
            synchronized (bouncers) {//accees concurent
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
