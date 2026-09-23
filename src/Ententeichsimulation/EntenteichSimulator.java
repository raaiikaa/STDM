package Ententeichsimulation;

import Ententeichsimulation.Entenarten.*;
import Ententeichsimulation.Flugverhalten.GarNichtFliegen;
import Ententeichsimulation.Flugverhalten.MitFluegelnFliegen;
import Ententeichsimulation.Flugverhalten.RaketenFlug;
import Ententeichsimulation.QuakVerhalten.Quaken;
import Ententeichsimulation.QuakVerhalten.Quietschen;
import Ententeichsimulation.QuakVerhalten.StummSein;

public class EntenteichSimulator {
    public static void main(String[] args) {
        Stockente stockEnte = new Stockente();
        stockEnte.display();
        stockEnte.setFlugVerhalten(new MitFluegelnFliegen());
        stockEnte.performFly();
        stockEnte.setQuakVerhalten(new Quaken());
        stockEnte.performQuack();
        stockEnte.swim();

        System.out.println();

        LoeffelEnte loeffelEnte = new LoeffelEnte();
        loeffelEnte.display();
        loeffelEnte.setFlugVerhalten(new MitFluegelnFliegen());
        loeffelEnte.performFly();
        loeffelEnte.setQuakVerhalten(new Quaken());
        loeffelEnte.performQuack();
        loeffelEnte.swim();

        System.out.println();

        QuietscheEnte quietscheEnte = new QuietscheEnte();
        quietscheEnte.display();
        quietscheEnte.setFlugVerhalten(new GarNichtFliegen());
        quietscheEnte.performFly();
        quietscheEnte.setQuakVerhalten(new Quietschen());
        quietscheEnte.performQuack();
        quietscheEnte.swim();

        System.out.println();

        HolzEnte holzEnte = new HolzEnte();
        holzEnte.display();
        holzEnte.setFlugVerhalten(new RaketenFlug());
        holzEnte.performFly();
        holzEnte.setQuakVerhalten(new StummSein());
        holzEnte.performQuack();
        holzEnte.swim();

        System.out.println();

        ModellEnte modellEnte = new ModellEnte();
        modellEnte.display();
        modellEnte.performQuack();
        modellEnte.performFly();
        modellEnte.setFlugVerhalten(new RaketenFlug());
        modellEnte.performFly();
    }
}
