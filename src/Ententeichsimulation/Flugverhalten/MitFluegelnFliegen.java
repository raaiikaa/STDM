package Ententeichsimulation.Flugverhalten;

public class MitFluegelnFliegen implements FlugVerhalten {
    @Override
    public void performFly() {
        System.out.println("Die Ente fliegt mit Flügeln");
    }
}
