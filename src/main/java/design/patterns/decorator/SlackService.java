package design.patterns.decorator;

public class SlackService extends CommunicatorDecorator{
    public SlackService(Communicator communicator) {
        super(communicator);
    }

    @Override
    public void sendMessage(int id, String message) {

    }
}
