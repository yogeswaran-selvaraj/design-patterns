package design.patterns.observer;

public class WeatherStationClient {
    public static void test(){
        WeatherData weatherData = new WeatherData();
        StaticsDisplay staticsDisplay = new StaticsDisplay(weatherData);
        FutureDisplay  futureDisplay = new FutureDisplay(weatherData);
        CurrentDisplay currentDisplay = new CurrentDisplay(weatherData);
//        weatherData.addObservable(staticsDisplay);
//        weatherData.addObservable(futureDisplay);
//        weatherData.addObservable(currentDisplay);
        weatherData.setNum(1);
    }
}
