package Ententeichsimulation.Entenarten;

import Ententeichsimulation.Flugverhalten.FlugVerhalten;
import Ententeichsimulation.Flugverhalten.MitFluegelnFliegen;
import Ententeichsimulation.QuakVerhalten.QuakVerhalten;
import Ententeichsimulation.QuakVerhalten.Quaken;

abstract class Duck implements QuakVerhalten, FlugVerhalten {

    QuakVerhalten quakVerhalten;
    FlugVerhalten flugVerhalten;

    public Duck() {
        this.flugVerhalten = new MitFluegelnFliegen();
        this.quakVerhalten = new Quaken();
    }

    public void performQuack() {
        quakVerhalten.performQuack();
    }

    public void performFly() {
        flugVerhalten.performFly();
    }

    public void swim() {
        System.out.println("Die Ente schwimmt");
    }

    public void setQuakVerhalten(QuakVerhalten quakVerhalten) {
        this.quakVerhalten = quakVerhalten;
    }

    public void setFlugVerhalten(FlugVerhalten flugVerhalten) {
        this.flugVerhalten = flugVerhalten;
    }

    abstract public void display();
}
