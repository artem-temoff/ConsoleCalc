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
    @Override
    public String toString() {
        return super.toString();
    }
}
