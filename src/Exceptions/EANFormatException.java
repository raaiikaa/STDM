package Exceptions;

public class EANFormatException extends EANException {
    @Override
    public String getMessage() {
        return "EAN is not valid. It contains symbols of illegal type.";
    }
}
