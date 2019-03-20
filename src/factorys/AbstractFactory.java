/**
 * @file AbstractFactory.java
 * @authors Lagha Oussama & Robel Teklehaimanot
 * @date 10.03.2019
 */
package factorys;

import view.Bouncable;
/**
 * implemnte le modéle conceptuel Factory
 * declare les methode pour cree des cerles et des caree
 */
public abstract class AbstractFactory {
    /**
     * cree un cercle
     * @return cercle
     */
    public abstract Bouncable getCircle();

    /**
     * cree un carre
     * @return carre
     */

    public abstract Bouncable getSquare();
}
