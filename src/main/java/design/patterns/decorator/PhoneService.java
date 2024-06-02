package design.patterns.decorator;

public class PhoneService extends CommunicatorDecorator {
    public PhoneService(Communicator communicator) {
        super(communicator);
    }

    public void sendMessage(int id, String message) {
        System.out.println("Sent phone message " + id + " " + message);
        communicator.sendMessage(id,message);
    }
}
