package Bingo;

import GeneratorAndPrinter.Printer;

import java.util.ArrayList;

public class Spielleiter {

    private Ziehungsgeraet2 ziehungsgeraet;
    private ArrayList<Integer> gezogeneNummern = new ArrayList<>();
    private Printer printer = new Printer();

    public void stelleZiehungsgeraetAuf() {
        this.ziehungsgeraet = new Ziehungsgeraet2();
    }

    public void stelleZiehungsgeraetMitAnzahlAuf(int anzahlNummern) {
        this.ziehungsgeraet = new Ziehungsgeraet2(anzahlNummern);
    }

    public int zieheNummerUndLeseVor() {
        int gezogeneNummer = ziehungsgeraet.gebeKugel();
        if (gezogeneNummer != -1) {
            System.out.println("Spielleiter: " + "'" + "Die gezogene Nummer lautet: " + gezogeneNummer + "'");
            gezogeneNummern.add(gezogeneNummer);
        }
        return gezogeneNummer;
    }

    public void druckeGezogeneNummern() {
        System.out.println("\n" + "Diese Zahlen wurden gezogen: ");
//        Collections.sort(gezogeneNummern);
        printer.printIntArrayList(gezogeneNummern);
    }
}
