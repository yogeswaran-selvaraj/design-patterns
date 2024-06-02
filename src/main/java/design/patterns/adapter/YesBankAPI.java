package design.patterns.adapter;

public class YesBankAPI {
    int checkBalance(){
        return 0;
    }

    void makePayment(int from, int to){
        System.out.println("from " + from + " to "+ to);
    }
}
