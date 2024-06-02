package design.patterns.strategy;

public class Navigator {
    private PathCalculator pathCalculator;
    public Navigator(PathCalculator pathCalculator){
        this.pathCalculator = pathCalculator;
    }

    public void navigate(int from , int to){
        pathCalculator.navigate(from, to);
    }
}
