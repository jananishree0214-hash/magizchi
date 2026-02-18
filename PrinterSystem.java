
interface Printer {
    void print();
}

class HPPrinter implements Printer, Runnable {

    @Override
    public void print() {
        System.out.println("HP Printer printing...");
    }

    @Override
    public void run() {
        print();
    }
}

class CanonPrinter implements Printer, Runnable {

    @Override
    public void print() {
        System.out.println("Canon Printer printing...");
    }

    @Override
    public void run() {
        print();
    }
}

public class PrinterSystem {

    public static void main(String[] args) {

        Thread t1 = new Thread(new HPPrinter());
        Thread t2 = new Thread(new CanonPrinter());

        t1.start();
        t2.start();
    }
}