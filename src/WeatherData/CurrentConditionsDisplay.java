package WeatherData;

public class CurrentConditionsDisplay {

    public void update(double temperature, double humidity, double pressure) {
        System.out.printf("Aktuell: %.1f °C, %.1f %%\n", temperature, humidity);
    }
}
