package Bingo;

public class MainBingo {


    public static void main(String[] args) {
        Spielleiter spielleiter = new Spielleiter();
        Spielkarte spielkarte = new Spielkarte();
        Spielkarte spielkarte2 = new Spielkarte();
        Spielkarte spielkarte3 = new Spielkarte();
        spielkarte.erstelleRandomSpielkarte("spieler1");
        spielkarte2.erstelleRandomSpielkarte("spieler2");
        spielkarte3.erstelleRandomSpielkarte("spieler3");

        int anzahlZuZiehendeNummern = 70;
        int anzahlNummernImZiehungsgerät = 75;

        spielleiter.stelleZiehungsgeraetMitAnzahlAuf(anzahlNummernImZiehungsgerät);

        for (int i = 0; i < anzahlZuZiehendeNummern; i++) {
            int gezogeneNummer = spielleiter.zieheNummerUndLeseVor();
            spielkarte.kreuzeZahlAn(gezogeneNummer);
            spielkarte2.kreuzeZahlAn(gezogeneNummer);
            spielkarte3.kreuzeZahlAn(gezogeneNummer);
            if (spielkarte.ueberpruefeBingokarte()) {
                spielkarte.druckeSpielkarte();
                System.out.println("Die Spielkarte mit dem Namen " + spielkarte.name + " hat gewonnen.");
                break;
            }
            if (spielkarte2.ueberpruefeBingokarte()) {
                spielkarte2.druckeSpielkarte();
                System.out.println("Die Spielkarte mit dem Namen " + spielkarte2.name + " hat gewonnen.");
                break;
            }
            if (spielkarte3.ueberpruefeBingokarte()) {
                spielkarte3.druckeSpielkarte();
                System.out.println("Die Spielkarte mit dem Namen " + spielkarte3.name + " hat gewonnen.");
                break;
            }
            spielkarte.druckeSpielkarte();
            spielkarte2.druckeSpielkarte();
            spielkarte3.druckeSpielkarte();

        }

        spielleiter.druckeGezogeneNummern();
    }
}
