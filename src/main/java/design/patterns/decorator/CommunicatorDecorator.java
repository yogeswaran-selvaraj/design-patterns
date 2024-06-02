package design.patterns.decorator;

public abstract class CommunicatorDecorator implements Communicator{
    public Communicator communicator;
    CommunicatorDecorator(Communicator communicator){
        this.communicator = communicator;
    }
}
