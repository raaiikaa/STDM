package WeatherData;

import WeatherData.Displays.CurrentConditionsDisplay;
import WeatherData.Displays.ForecastDisplay;
import WeatherData.Displays.StatisticsDisplay;
import WeatherData.Displays.WarnungDisplay;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherDataPhase2 weatherData = new WeatherDataPhase2();

        weatherData.registerObserver(new CurrentConditionsDisplay());
        weatherData.registerObserver(new StatisticsDisplay());
        weatherData.registerObserver(new ForecastDisplay());
        weatherData.registerObserver(new WarnungDisplay());

        changeMeasurementsAndNotifyObservers(weatherData, -1.0, 65, 1013);
        changeMeasurementsAndNotifyObservers(weatherData, 23.0, 60, 1010);
        changeMeasurementsAndNotifyObservers(weatherData, 19.8, 94, 1004);
        changeMeasurementsAndNotifyObservers(weatherData, 20.0, 72, 1006);
        changeMeasurementsAndNotifyObservers(weatherData, 31.0, 72, 1006);
    }

    static void changeMeasurementsAndNotifyObservers(WeatherDataPhase2 weatherData, double temperature, double humidity, double pressure) {
        weatherData.setMeasurements(temperature, humidity, pressure);
        weatherData.notifyObservers();
        System.out.println();
    }
}
