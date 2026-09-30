
package WeatherData;

import java.util.ArrayList;
import java.util.List;

public class WeatherDataPhase2 implements Subject {

    private List<Observer> observers;
    private double temperature;
    private double humidity;
    private double pressure;

    public WeatherDataPhase2() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    public void setMeasurements(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }
}
