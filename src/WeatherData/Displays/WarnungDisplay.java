package WeatherData.Displays;

import WeatherData.Interfaces.Observer;

public class WarnungDisplay implements Observer {
    @Override
    public void update(double temperature, double humidity, double pressure) {
        if (temperature > 30.0) {
            System.out.println("Warnung: Es wird sehr heiß!");
        }

        if (temperature < 0.0) {
            System.out.println("Warnung: Es wird sehr kalt!");
        }

        if (pressure < 990.0) {
            System.out.println("Warnung: Der Druck sinkt sehr stark!");
        }

        if (humidity > 90.0) {
            System.out.println("Warnung: Die Feuchtigkeit erreicht einen zu hohen Wert!");
        }
    }
}
