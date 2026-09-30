package WeatherData.Displays;

import WeatherData.Observer;

public class CurrentConditionsDisplay implements Observer {

    public void update(double temperature, double humidity, double pressure) {
        System.out.printf("Aktuell: %.1f °C, %.1f %%\n", temperature, humidity);
    }
}
