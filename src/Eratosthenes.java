public class Eratosthenes {
    public static void main(String[] args) {

        long start = System.nanoTime();

        boolean[] gestrichen = new boolean[1000000];
        gestrichen[0] = gestrichen[1] = true;
        int aktZahl = 2;

        while (aktZahl < gestrichen.length) {

            if (!gestrichen[aktZahl]) {
                System.out.println(aktZahl);
                int zuStreichendeZahl = aktZahl;

                while (zuStreichendeZahl + aktZahl < gestrichen.length) {
                    gestrichen[zuStreichendeZahl + aktZahl] = true;
                    zuStreichendeZahl = zuStreichendeZahl + aktZahl;
                }
            }
            aktZahl = aktZahl + 1;
        }

        long ende = System.nanoTime();
        System.out.println();
        System.out.println((ende - start) / 1000.0 + " Mikrosekunden");
    }
}
