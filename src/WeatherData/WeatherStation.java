package WeatherData;

import WeatherData.Displays.CurrentConditionsDisplay;
import WeatherData.Displays.ForecastDisplay;
import WeatherData.Displays.StatisticsDisplay;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherDataPhase2 weatherData = new WeatherDataPhase2();

        weatherData.registerObserver(new CurrentConditionsDisplay());
        weatherData.registerObserver(new StatisticsDisplay());
        weatherData.registerObserver(new ForecastDisplay());

        changeMeasurementsAndNotifyObservers(weatherData, 21.5, 65, 1013);
        changeMeasurementsAndNotifyObservers(weatherData, 23.0, 60, 1010);
        changeMeasurementsAndNotifyObservers(weatherData, 19.8, 72, 1004);
        changeMeasurementsAndNotifyObservers(weatherData, 20.0, 72, 1006);
        changeMeasurementsAndNotifyObservers(weatherData, 20.0, 72, 1006);
    }

    static void changeMeasurementsAndNotifyObservers(WeatherDataPhase2 weatherData, double temperature, double humidity, double pressure) {
        weatherData.setMeasurements(temperature, humidity, pressure);
        weatherData.notifyObservers();
    }
}
