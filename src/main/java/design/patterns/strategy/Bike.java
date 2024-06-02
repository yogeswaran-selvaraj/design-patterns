package design.patterns.strategy;

public class Bike implements PathCalculator{
    @Override
    public void navigate(int from, int to) {
        return false;
    }
}
