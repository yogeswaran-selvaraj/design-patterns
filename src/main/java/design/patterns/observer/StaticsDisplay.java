package design.patterns.observer;

public class StaticsDisplay implements Observer, Display{
    StaticsDisplay(WeatherData weatherData){
        weatherData.addObservable(this);
    }
    @Override
    public void display() {

    }

    @Override
    public void update(int num) {
        System.out.println("This is StaticsDisplay " + num);
    }
}
