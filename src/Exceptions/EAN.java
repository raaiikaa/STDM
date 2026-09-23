package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EAN {
    public static void main(String[] args) throws EANException {
        Scanner scanner = new Scanner(System.in);
        Long inputEAN;

        try {
            inputEAN = scanner.nextLong();
        } catch (InputMismatchException e) {
            throw new EANFormatException();
        }

        if (inputEAN.toString().length() < 8 || inputEAN.toString().length() > 13) {
            throw new EANTooLongOrShortException();
        }

    }
}
