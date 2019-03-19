/**
 * @file AbstractFactory.java
 * @authors Lagha Oussama & Robel
 * @date 10.03.2019
 */
package factorys;

import view.Bouncable;

public abstract class AbstractFactory {
    public abstract Bouncable getCircle();

    public abstract Bouncable getSquare();
}
