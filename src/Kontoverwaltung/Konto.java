package Kontoverwaltung;

import java.util.Date;

public class Konto {

    String kontoInhaber;
    Date geburtsDatum;
    String adresse;
    int kontoNummer = 1000000000;

    public Konto(String kontoInhaber, Date geburtsDatum, String adresse) {
        this.kontoInhaber = kontoInhaber;
        this.geburtsDatum = geburtsDatum;
        this.adresse = adresse;
    }

    public int getKontoNummerForKonto() {
        setKontoNummer(getKontoNummer() + 1);
        return kontoNummer;
    }

    public String getKontoInhaber() {
        return kontoInhaber;
    }

    public void setKontoInhaber(String kontoInhaber) {
        this.kontoInhaber = kontoInhaber;
    }

    public Date getGeburtsDatum() {
        return geburtsDatum;
    }

    public void setGeburtsDatum(Date geburtsDatum) {
        this.geburtsDatum = geburtsDatum;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getKontoNummer() {
        return kontoNummer;
    }

    public void setKontoNummer(int kontoNummer) {
        this.kontoNummer = kontoNummer;
    }
}
