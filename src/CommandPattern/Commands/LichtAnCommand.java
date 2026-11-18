package CommandPattern.Commands;

import CommandPattern.Receiver.Lampe;

public class LichtAnCommand implements Command {
    private Lampe lampe;

    public LichtAnCommand(final Lampe lampe) {
        this.lampe = lampe;
    }

    @Override
    public void execute() {
        lampe.lichtAn();
    }
}
