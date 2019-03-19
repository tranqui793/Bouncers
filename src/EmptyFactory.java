public class EmptyFactory extends AbstractFactory {
    private static EmptyFactory ourInstance = new EmptyFactory();

    public static EmptyFactory getInstance() {
        return ourInstance;
    }

    private EmptyFactory() {
    }

    @Override
    Bouncable getCircle() {
        return new CircleBordered();
    }

    @Override
    Bouncable getSquare() {
        return new SquareBordered();
    }
}
