package design.patterns.adapter;

public class YesBankAPIAdapter implements BankAPI{
    YesBankAPI yesBankAPI = new YesBankAPI();
    @Override
    public int getBalance() {
        return yesBankAPI.checkBalance();
    }

    @Override
    public void moneyTransfer(int userIdFrom, int userIdTo) {
        System.out.println("from "  + userIdFrom + " to " + userIdTo);
        yesBankAPI.makePayment(userIdFrom, userIdTo);
    }
}
