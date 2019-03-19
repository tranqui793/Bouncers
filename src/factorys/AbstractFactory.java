package factorys;

import view.Bouncable;

public abstract class AbstractFactory {
    public abstract Bouncable getCircle();

    public abstract Bouncable getSquare();
}
