/**
 * @file FilledFactory.java
 * @authors Lagha Oussama & Robel Teklehaimanot
 * @date 10.03.2019
 */
package factorys;

import view.Bouncable;
import forms.CircleFilled;
import forms.SquareFilled;


/**
 * implemente le modéle conceptuel FilledFactory
 */
public class FilledFactory extends AbstractFactory {
    private static FilledFactory ourInstance = new FilledFactory();//unique instance

    /**
     * permet de recupere l'instance
     * @return une instance
     */
    public static FilledFactory getInstance() {
        return ourInstance;
    }

    /**
     * permet de recuperer un cercle rempli
     * @return un cercle
     */
    @Override
    public Bouncable getCircle() {
        return new CircleFilled();
    }

    /**
     * permet de recuperer un cercle rempli
     * @return un cercle
     */
    @Override
    public Bouncable getSquare() {
        return new SquareFilled();
    }
}
