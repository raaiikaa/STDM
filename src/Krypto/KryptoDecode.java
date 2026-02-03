package Krypto;

public class KryptoDecode {
    public static void main(String[] args) {
        findeWiederholungen("ANAPP LEADA YKEEP STHED OCTOR AWAYB UTIFT HEDOC ANRIS CUTEF ORGET THEFR UIT");
        findeWiederholungenKI("ANAPP LEADA YKEEP STHED OCTOR AWAYB UTIFT HEDOC ANRIS CUTEF ORGET THEFR UIT");
    }

    static void findeWiederholungen(String text) {
        for (int laenge = text.length(); laenge > 1; laenge--) {
            for (int start = 0; start < text.length() - laenge; start++) {
                String wort = text.substring(start, start + laenge);
                int ix = wort.indexOf(wort, start + 1);
                if (ix > 0) {
                    System.out.println(wort + ", " + start + ", " + ix);
                }
            }
        }
    }

    public static void findeWiederholungenKI(String txt) {

        int n = txt.length();

        // Länge von n bis 2 herunterzählen

        for (int laenge = n; laenge > 1; laenge--) {

            // Startindex von 0 bis n - laenge

            for (int start = 0; start <= n - laenge; start++) {

                String wort = txt.substring(start, start + laenge);

                int ix = txt.indexOf(wort, start + 1);

                if (ix > 0) {

                    System.out.println(wort + " " + start + " " + ix);

                }

            }

        }

    }
}
