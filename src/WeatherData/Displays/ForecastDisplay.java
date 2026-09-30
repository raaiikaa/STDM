package WeatherData.Displays;

import WeatherData.Observer;

public class ForecastDisplay implements Observer {

    private double currentTemperature;
    private double currentHumidity;
    private double currentPressure;

    public ForecastDisplay() {
        this.currentTemperature = 20.0;
        this.currentHumidity = 50.0;
        this.currentPressure = 1013.0;
    }

    public void update(double newTemperature, double newHumidity, double newPressure) {
        if (newPressure > currentPressure) {
            System.out.println("Wetter wird besser");
        } else if (newPressure < currentPressure) {
            System.out.println("Wetter wird schlechter");
        } else if (newPressure == currentPressure) {
            System.out.println("Keine wesentliche Änderung");
        }

        currentTemperature = newTemperature;
        currentHumidity = newHumidity;
        currentPressure = newPressure;

    }
}
