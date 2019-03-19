public class FilledFactory extends AbstractFactory {
    private static FilledFactory ourInstance = new FilledFactory();

    public static FilledFactory getInstance() {
        return ourInstance;
    }

    private FilledFactory() {
    }
    @Override
    Bouncable getCircle() {
        return new CircleFilled();
    }

    @Override
    Bouncable getSquare() {
        return new SquareFilled();
    }
}
