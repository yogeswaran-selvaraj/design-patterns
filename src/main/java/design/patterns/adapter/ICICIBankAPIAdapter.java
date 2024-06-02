package design.patterns.adapter;

public class ICICIBankAPIAdapter implements BankAPI{
    ICICIBankAPI iciciBankAPI = new ICICIBankAPI();
    @Override
    public int getBalance() {
        return iciciBankAPI.getBalance();
    }

    @Override
    public void moneyTransfer(int userIdFrom, int userIdTo) {
        iciciBankAPI.transferPayment(userIdFrom, userIdTo);
    }
}
