package states;

/**
 * Created by Artem Eremenko on 07.04.2015.
 */
public class NoSuchOperationInputException extends RuntimeException {
    public NoSuchOperationInputException() {
        super();
    }
    public NoSuchOperationInputException(String message) {
        super(message);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
