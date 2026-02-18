
abstract class Payment {
    int amount;
    Payment(int amount) { this.amount = amount; }
}

class CardPayment extends Payment implements Runnable {
    CardPayment(int amount) { super(amount); }
    public void process() {
        System.out.println("Card payment of " + amount + " completed");
    }
    @Override
    public void run() { process(); }
}

class UPIPayment extends Payment implements Runnable {
    UPIPayment(int amount) { super(amount); }
    public void process() {
        System.out.println("UPI payment of " + amount + " completed");
    }
    @Override
    public void run() { process(); }
}

public class PaymentSystem {
    public static void main(String[] args) {
        new Thread(new CardPayment(2000)).start();
        new Thread(new UPIPayment(1500)).start();
    }
}