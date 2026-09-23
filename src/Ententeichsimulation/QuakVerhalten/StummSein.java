package Ententeichsimulation.QuakVerhalten;

public class StummSein implements QuakVerhalten {
    @Override
    public void performQuack() {
        System.out.println("Die Ente schweigt");
    }
}
