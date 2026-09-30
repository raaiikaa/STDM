package WeatherData.Displays;

import WeatherData.Observer;

public class StatisticsDisplay implements Observer {

    public void update(double temperature, double humidity, double pressure) {
        System.out.println("Statistik erhält Temperatur: " + temperature);
    }
}
