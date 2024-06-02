package design.patterns.strategy;

public class Bus implements PathCalculator{
    @Override
    public void navigate(int from, int to) {
        return true;
    }
}
