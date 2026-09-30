package WeatherData;

public class WeatherData {

    private double temperature;
    private double humidity;
    private double pressure;

    private CurrentConditionsDisplay currentDisplay;
    private StatisticsDisplay statisticsDisplay;

    public WeatherData() {
        currentDisplay = new CurrentConditionsDisplay();
        statisticsDisplay = new StatisticsDisplay();
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
    }
}
