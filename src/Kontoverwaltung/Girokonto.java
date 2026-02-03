package Kontoverwaltung;

import java.util.Date;

public class Girokonto extends Konto {

    public Girokonto(String kontoInhaber, Date geburtsDatum, String adresse) {
        super(kontoInhaber, geburtsDatum, adresse);
    }
}
