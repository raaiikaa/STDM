package SafePrime;

import java.math.BigInteger;
import java.util.Scanner;

public class PrimeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            BigInteger bigInteger = scanner.nextBigInteger();
            System.out.println(bigInteger.nextProbablePrime());
        }

    }
}
