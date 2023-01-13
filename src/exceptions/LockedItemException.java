package exceptions;
import exceptions.WrapperException;

public class LockedItemException extends WrapperException {

    public LockedItemException(String message) {
        super(message);
    }
}
