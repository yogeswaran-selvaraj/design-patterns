package design.patterns.strategy;

public class Car implements PathCalculator{
    @Override
    public void navigate(int from, int to) {
        return false;
    }
}
