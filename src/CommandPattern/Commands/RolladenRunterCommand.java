package CommandPattern.Commands;

import CommandPattern.Receiver.Rolladen;

public class RolladenRunterCommand implements Command {
    Rolladen rolladen;

    public RolladenRunterCommand(final Rolladen rolladen) {
        this.rolladen = rolladen;
    }

    @Override
    public void execute() {
        rolladen.herunterfahren();
    }
}
