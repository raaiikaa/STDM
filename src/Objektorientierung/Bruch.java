package Objektorientierung;

public class Bruch {
    private int zaehler;
    private int nenner;

    public Bruch(int zaehler, int nenner){
        this.zaehler = zaehler;
        this.nenner = nenner;
    }

    public int getZaehler() {
        return zaehler;
    }

    public int getNenner() {
        return nenner;
    }

    @Override
    public String toString() {
        return "( " + zaehler + " / " + nenner + " )";
    }

    public double asDouble(){
        return (double)zaehler / (double)nenner;
    }

    public Bruch mult(int factor){
        int zaehler = this.zaehler;
        int nenner = this.nenner;

        zaehler = zaehler * factor;

        return kuerze(new Bruch(zaehler, nenner));
    }

    public Bruch mult(Bruch factor){
        int zaehler = this.zaehler;
        int nenner = this.nenner;

        zaehler = zaehler * factor.getZaehler();
        nenner = nenner * factor.getNenner();

        return kuerze(new Bruch(zaehler, nenner));
    }

    public Bruch add(Bruch factor){
        int zaehlerBruch1 = this.zaehler;
        int nennerBruch1 = this.nenner;

        int ggT = ggT(nenner, factor.getNenner());

        zaehlerBruch1 = zaehlerBruch1 * (ggT / nennerBruch1);
        nennerBruch1 = ggT;

        int zaehlerBruch2 = factor.getZaehler() * (ggT / factor.getNenner());
        int nennerBruch2 = ggT;

        return kuerze(new Bruch(zaehlerBruch1 + zaehlerBruch2, ggT));
    }

    public Bruch sub(Bruch subtrahend){
        int zaehlerBruch1 = this.zaehler;
        int nennerBruch1 = this.nenner;

        int ggT = ggT(nenner, subtrahend.getNenner());

        zaehlerBruch1 = zaehlerBruch1 * (ggT / nennerBruch1);
        nennerBruch1 = ggT;

        int zaehlerBruch2 = subtrahend.getZaehler() * (ggT / subtrahend.getNenner());
        int nennerBruch2 = ggT;

        int zaehler = zaehlerBruch1 > zaehlerBruch2 ? zaehlerBruch1 - zaehlerBruch2 : zaehlerBruch2 - zaehlerBruch1;

        return kuerze(new Bruch(zaehler, ggT));
    }



    public static int ggT(int a, int b){
        int bigger = 0;
        int smaller = 0;
        int ggT = 0;

        if(a > b){
             bigger = a;
             smaller = b;
        }else if(b > a){
             bigger = b;
             smaller = a;
        }else{
             bigger = a;
             smaller = b;
        }

        for(int i=bigger; i<100; i++){
            if(i % bigger == 0 && i % smaller == 0){
                ggT = i;
                break;
            }
        }
        return ggT;
    }

    private static Bruch kuerze(Bruch bruch){
        int highestDivider = 1;

        for(int i=1; i<20; i++){
            if(bruch.getNenner() % i == 0 && bruch.getZaehler() % i == 0 ){
                highestDivider = i;
            }
        }

        return new Bruch(bruch.getZaehler() / highestDivider, bruch.getNenner() / highestDivider);
    }
}
