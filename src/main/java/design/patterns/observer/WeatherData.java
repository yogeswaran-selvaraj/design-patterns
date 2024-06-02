package design.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Observable{
    int num;
    public List<Observer> observerList = new ArrayList<>();

    public void setNum(int num){
        this.num = num;
        notifyObserver();
    }


    @Override
    public void addObservable(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObservable(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer : observerList){
            observer.update(1);
        }
    }
}
