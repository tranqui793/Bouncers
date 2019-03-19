/**
 * @file FilledFactory.java
 * @authors Lagha Oussama & Robel
 * @date 10.03.2019
 */
package factorys;

import factorys.AbstractFactory;
import view.Bouncable;
import forms.CircleFilled;
import forms.SquareFilled;

public class FilledFactory extends AbstractFactory {
    private static FilledFactory ourInstance = new FilledFactory();

    public static FilledFactory getInstance() {
        return ourInstance;
    }

    private FilledFactory() {
    }

    @Override
    public Bouncable getCircle() {
        return new CircleFilled();
    }

    @Override
    public Bouncable getSquare() {
        return new SquareFilled();
    }
}
