package operations;

/**
 * Created by Artem Eremenko on 07.04.2015.
 */
class DivisionByZero extends RuntimeException {
    public DivisionByZero() {
        super();
    }
    public DivisionByZero(String message) {
        super(message);
    }

    //TODO For which purpose you add overriding, but change nothing???
    @Override
    public String toString() {
        return super.toString();
    }
}
