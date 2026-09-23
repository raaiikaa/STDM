package GeradeUngerade;

public class RekursivGeradeUngerade {
    public static void main(String[] args) {
        System.out.println("5 ist eine gerade Zahl: " + g(5) + " -> genutzte Methode: g(5)");
        System.out.println("5 ist eine ungerade Zahl: " + u(5) + " -> genutzte Methode: u(5)");

        System.out.println();

        System.out.println("8 ist eine gerade Zahl: " + g(8) + " -> genutzte Methode: g(8)");
        System.out.println("8 ist eine ungerade Zahl: " + u(8) + " -> genutzte Methode: u(8)");
    }

    private static Boolean g(int n) {
        if (n == 0) {
            return true;
        }
        return u(n - 1);
    }

    private static Boolean u(int n) {
        if (n == 0) {
            return false;
        }
        return g(n - 1);
    }


}
