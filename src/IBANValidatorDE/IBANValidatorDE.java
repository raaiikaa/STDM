package IBANValidatorDE;

import java.math.BigInteger;

public class IBANValidatorDE {

    public boolean isValid(String iban) {
        String ibanShortened = iban.replace(" ", "");
        if (ibanShortened.length() != 22) {
            return false;
        }
        if (!ibanShortened.startsWith("DE")) {
            return false;
        }
        if (Integer.parseInt(ibanShortened.substring(2, 4)) > 96) {
            return false;
        }

        String firstHalf = ibanShortened.substring(0, 4).replaceAll("DE", "1314");
        String secondHalf = ibanShortened.substring(4, 22);
        String finalString = secondHalf.concat(firstHalf);
        BigInteger finalBigInt;

        try {
            finalBigInt = new BigInteger(finalString);
        } catch (NumberFormatException nfe) {
            return false;
        }

        return finalBigInt.mod(BigInteger.valueOf(97)).equals(BigInteger.valueOf(1));
    }
}
