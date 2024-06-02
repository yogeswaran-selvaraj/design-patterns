package design.patterns.decorator;

public class Client {
    public static void main(String[] args) {
        Communicator communicator = new EmailService();
        Communicator phoneCommunication = new PhoneService(communicator);
        Communicator slack = new SlackService(phoneCommunication);
        slack.sendMessage(1, "Hi");
    }
}
