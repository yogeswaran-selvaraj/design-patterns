package design.patterns.facade;

import design.patterns.adapter.BankAPI;
import design.patterns.adapter.ICICIBankAPIAdapter;
import design.patterns.adapter.YesBankAPIAdapter;
import design.patterns.observer.Observable;
import design.patterns.observer.Observer;

public class Order {
    private OrderProcesscor orderProcesscor = new OrderProcesscor();
//    Below code moved to processor file for making facade


//    private ICICIBankAPIAdapter paymentGateway;
//    private YesBankAPIAdapter inventory;
//    private BankAPI emailService;
//    private Observable shippingService;
//    public void checkout() {
//        paymentGateway.getBalance();
//        inventory.getBalance();
//        emailService.getBalance();
//        shippingService.notifyObserver();
//    }
    public void order(){
        orderProcesscor.checkout();
    }

}
