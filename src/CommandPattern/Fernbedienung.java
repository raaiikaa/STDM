package CommandPattern;

import CommandPattern.Commands.Command;

public class Fernbedienung {
    private Command command;

    public void setCommand(final Command command) {
        this.command = command;
    }

    public void tasteDruecken() {
        command.execute();
    }
}
