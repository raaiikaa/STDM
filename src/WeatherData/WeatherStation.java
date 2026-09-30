package WeatherData;

import WeatherData.Displays.CurrentConditionsDisplay;
import WeatherData.Displays.ForecastDisplay;
import WeatherData.Displays.StatisticsDisplay;
import WeatherData.Displays.WarnungDisplay;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherDataPhase2 weatherData = new WeatherDataPhase2();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();
        WarnungDisplay warnungDisplay = new WarnungDisplay();

        weatherData.registerObserver(currentConditionsDisplay);
        weatherData.registerObserver(statisticsDisplay);
        weatherData.registerObserver(forecastDisplay);
        weatherData.registerObserver(warnungDisplay);

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
