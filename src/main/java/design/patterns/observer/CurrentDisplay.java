package design.patterns.observer;

public class CurrentDisplay implements Observer,Display{
    public CurrentDisplay(WeatherData weatherData) {
        weatherData.addObservable(this);
    }

    @Override
    public void display() {

    }

    @Override
    public void update(int num) {
        System.out.println("This is CurrentDisplay " + num);
    }
}
