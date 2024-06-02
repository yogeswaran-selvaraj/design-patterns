package design.patterns.adapter;

public interface BankAPI {
    int getBalance();
    void moneyTransfer(int userIdFrom, int userIdTo);
}
