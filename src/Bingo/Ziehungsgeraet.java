package Bingo;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Ziehungsgeraet {

    private int anzahlKugeln;
    private ArrayList<Integer> zahlenArray;

    public Ziehungsgeraet() {
        this.anzahlKugeln = 75;
        this.zahlenArray = new ArrayList<>();
        befuelleArray();
    }

    public Ziehungsgeraet(int anzahlKugeln) {
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
        int randomNumber = 0;

        if (!zahlenArray.isEmpty()) {
            while (!zahlenArray.contains(randomNumber)) {
                randomNumber = ThreadLocalRandom.current().nextInt(1, anzahlKugeln + 1);
            }

            int indexOfNumber = zahlenArray.indexOf(randomNumber);
            zahlenArray.remove(indexOfNumber);
        } else {
            return -1;
        }
        return randomNumber;
    }
}
