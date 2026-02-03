package Kontoverwaltung;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        Girokonto girokonto = new Girokonto("Lennard", date, "Eifelstraﬂe");
        girokonto.getKontoNummerForKonto();
        Sparkonto sparkonto = new Sparkonto("Lennard", date, "Eifelstraﬂe");
        sparkonto.getKontoNummerForKonto();
        String test = "";
    }
}
