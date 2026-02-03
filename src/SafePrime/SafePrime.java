package SafePrime;

import java.math.BigInteger;

public class SafePrime {
    public static void main(String[] args) {
        BigInteger a = new BigInteger("17");
        BigInteger b = new BigInteger("4");

        BigInteger generator = new BigInteger("3");
        BigInteger safePrime = new BigInteger("23");

        BigInteger bigIntegerA = generator.modPow(a, safePrime);
        BigInteger bigIntegerB = generator.modPow(b, safePrime);

        bigIntegerB.modPow(a, safePrime);
        bigIntegerA.modPow(b, safePrime);
    }
}
