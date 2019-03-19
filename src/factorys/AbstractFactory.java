package factorys;

import view.Bouncable;

public abstract class AbstractFactory {
    abstract Bouncable getCircle();

    abstract Bouncable getSquare();
}
