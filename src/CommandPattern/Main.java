package CommandPattern;

import CommandPattern.Commands.LichtAnCommand;
import CommandPattern.Commands.LichtAusCommand;
import CommandPattern.Commands.RolladenRunterCommand;
import CommandPattern.Receiver.Lampe;
import CommandPattern.Receiver.Rolladen;

public class Main {
    public static void main(String[] args) {

        final Fernbedienung fernbedienung = new Fernbedienung();

        final Lampe lampe = new Lampe();
        final Rolladen rolladen = new Rolladen();

        final LichtAnCommand lichtAnCommand = new LichtAnCommand(lampe);
        fernbedienung.setCommand("1", lichtAnCommand);
        fernbedienung.tasteDruecken("1");

        final LichtAusCommand lichtAusCommand = new LichtAusCommand(lampe);
        fernbedienung.setCommand("2", lichtAusCommand);
        fernbedienung.tasteDruecken("2");

        final RolladenRunterCommand rolladenRunterCommand = new RolladenRunterCommand(rolladen);
        fernbedienung.setCommand("3", rolladenRunterCommand);
        fernbedienung.tasteDruecken("3");
    }
}
