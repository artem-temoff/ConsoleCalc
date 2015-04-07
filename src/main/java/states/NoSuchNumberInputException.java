package states;

/**
 * Created by Artem Eremenko on 07.04.2015.
 */
class NoSuchNumberInputException extends RuntimeException {
    public NoSuchNumberInputException() {
        super();
    }
    public NoSuchNumberInputException(String message) {
        super(message);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
