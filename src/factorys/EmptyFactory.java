/**
 * @file EmptyFactory.java
 * @authors Lagha Oussama & Robel Teklehaimanot
 * @date 10.03.2019
 */
package factorys;

import view.Bouncable;
import forms.CircleBordered;
import forms.SquareBordered;

public class EmptyFactory extends AbstractFactory {
    private static EmptyFactory ourInstance = new EmptyFactory();

    public static EmptyFactory getInstance() {
        return ourInstance;
    }

    private EmptyFactory() {
    }

    @Override
    public Bouncable getCircle() {
        return new CircleBordered();
    }

    @Override
    public Bouncable getSquare() {
        return new SquareBordered();
    }
}
