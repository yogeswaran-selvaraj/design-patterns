package design.patterns.factory.button;

public class IOSButton implements Button{
    @Override
    public int getSize() {
        return 2;
    }
}
