/**
 * @file Renderable.java
 * @authors Lagha Oussama & Robel Teklehaimanot
 * @date 10.03.2019
 */
package view;

import java.awt.*;

public interface Renderable {
    /**
     * dessine la forme de l'objet Bouncable passe en parametre
     * @param g le graphique sur lequel on dessine
     * @param b la Bouncable a dessiner
     */
    void display(Graphics2D g, Bouncable b);

}
