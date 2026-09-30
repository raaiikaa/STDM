package WeatherData;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        weatherData.setMeasurements(21.5, 65, 1013);
        weatherData.setMeasurements(23.0, 60, 1010);
        weatherData.setMeasurements(19.8, 72, 1004);
    }
}
