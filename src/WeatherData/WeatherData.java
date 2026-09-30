package WeatherData;

import WeatherData.Displays.CurrentConditionsDisplay;
import WeatherData.Displays.ForecastDisplay;
import WeatherData.Displays.StatisticsDisplay;

public class WeatherData {

    private double temperature;
    private double humidity;
    private double pressure;

    private CurrentConditionsDisplay currentDisplay;
    private StatisticsDisplay statisticsDisplay;
    private ForecastDisplay forecastDisplay;

    public WeatherData() {
        currentDisplay = new CurrentConditionsDisplay();
        statisticsDisplay = new StatisticsDisplay();
        forecastDisplay = new ForecastDisplay();
    }

    public void setMeasurements(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    private void measurementsChanged() {
        currentDisplay.update(temperature, humidity, pressure);
        statisticsDisplay.update(temperature, humidity, pressure);
        forecastDisplay.update(temperature, humidity, pressure);
        System.out.println();
    }
}
