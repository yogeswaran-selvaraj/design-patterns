package design.patterns.strategy;

public class Client {

    public static void main(String[] args) {
        Navigator navigator = new Navigator(new Bike());
        navigator.navigate(1,2);
    }
}
