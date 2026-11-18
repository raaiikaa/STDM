package CommandPattern;

import CommandPattern.Commands.Command;

import java.util.HashMap;

public class Fernbedienung {
    private HashMap<String, Command> layout;

    public Fernbedienung() {
        this.layout = new HashMap<String, Command>();
    }

    public void setCommand(final String taste, final Command command) {
        this.layout.put(taste, command);
    }

    public void tasteDruecken(final String taste) {
        if (layout.containsKey(taste)) {
            Command command = layout.get(taste);
            command.execute();
        } else {
            System.out.println("Kein Command hinterlegt");
        }

    }
}
