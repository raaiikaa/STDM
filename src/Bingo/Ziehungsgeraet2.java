package Bingo;

import java.util.ArrayList;
import java.util.Collections;

public class Ziehungsgeraet2 {

    private int anzahlKugeln;
    private ArrayList<Integer> zahlenArray;

    public Ziehungsgeraet2() {
        this.anzahlKugeln = 75;
        this.zahlenArray = new ArrayList<>();
        befuelleArray();
    }

    public Ziehungsgeraet2(int anzahlKugeln) {
        this.anzahlKugeln = anzahlKugeln;
        this.zahlenArray = new ArrayList<>();
        befuelleArray();
    }

    private void befuelleArray() {
        for (int i = 0; i < anzahlKugeln; i++) {
            zahlenArray.add(i + 1);
        }
    }

    public int gebeKugel() {
        Collections.shuffle(zahlenArray);

        if (!zahlenArray.isEmpty()) {
            int gezogeneNummer = zahlenArray.get(0);
            zahlenArray.remove(0);
            return gezogeneNummer;
        } else {
            return -1;
        }
    }
}
