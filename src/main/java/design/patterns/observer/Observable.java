package design.patterns.observer;

public interface Observable {
    void addObservable(Observer observer);
    void removeObservable(Observer observer);
    void notifyObserver();
}
