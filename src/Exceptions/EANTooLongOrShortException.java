package Exceptions;

public class EANTooLongOrShortException extends EANException {
    @Override
    public String getMessage() {
        return "EAN is not valid. It is too long or too short.";
    }
}
