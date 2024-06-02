package design.patterns.observer;

public class FutureDisplay implements Observer, Display{
    public FutureDisplay(WeatherData weatherData) {
        weatherData.addObservable(this);
    }

    @Override
    public void display() {

    }

    @Override
    public void update(int num) {
        System.out.println("This is FutureDisplay " + num);
    }
}
