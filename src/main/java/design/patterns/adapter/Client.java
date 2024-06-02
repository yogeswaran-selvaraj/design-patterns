package design.patterns.adapter;

public class Client {
    public static void main(String[] args) {
        BankAPI bankAPI = new YesBankAPIAdapter();
        bankAPI.getBalance();
        bankAPI.moneyTransfer(1, 2);
    }
}
