package design.patterns.factory.button;

public class AndroidButton implements Button {
    @Override
    public int getSize() {
        return 1;
    }
}
