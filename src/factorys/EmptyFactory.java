/**
 * @file EmptyFactory.java
 * @authors Lagha Oussama & Robel Teklehaimanot
 * @date 10.03.2019
 */
package factorys;

import view.Bouncable;
import forms.CircleBordered;
import forms.SquareBordered;

/**
 * implemente le modéle conceptuel EmptyFactory
 */
public class EmptyFactory extends AbstractFactory {
    private static EmptyFactory ourInstance = new EmptyFactory();

    /**
     * permet de recupere l'instance
     * @return une instance
     */
    public static EmptyFactory getInstance() {
        return ourInstance;
    }

    /**
     * permet de recuperer un cercle avec un bord
     * @return un cercle
     */
    @Override
    public Bouncable getCircle() {
        return new CircleBordered();
    }

    /**
     * permet de recupere un carrée avec un bord
     * @return un carrée
     */
    @Override
    public Bouncable getSquare() {
        return new SquareBordered();
    }
}
