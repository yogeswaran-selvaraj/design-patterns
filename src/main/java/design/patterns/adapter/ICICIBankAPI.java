package design.patterns.adapter;

public class ICICIBankAPI {
    int getBalance(){
        return 0;
    }

    void transferPayment(int from, int to){
        System.out.println("from " + from + " to "+ to);
    }
}
