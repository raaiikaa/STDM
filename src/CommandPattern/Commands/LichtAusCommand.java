package CommandPattern.Commands;

import CommandPattern.Receiver.Lampe;

public class LichtAusCommand implements Command {
    private Lampe lampe;

    public LichtAusCommand(final Lampe lampe) {
        this.lampe = lampe;
    }

    @Override
    public void execute() {
        lampe.lichtAus();
    }
}
