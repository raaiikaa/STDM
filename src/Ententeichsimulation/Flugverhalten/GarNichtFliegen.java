package Ententeichsimulation.Flugverhalten;

public class GarNichtFliegen implements FlugVerhalten {
    @Override
    public void performFly() {
        System.out.println("Die Ente kann nicht fliegen");
    }
}
