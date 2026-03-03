
import java.util.Scanner;

class Laptop {

    
    private final String brand;
    private final String ram;

    
    private final boolean ssd;
    private final boolean graphicsCard;
    private final boolean extendedWarranty;
    private final boolean msOffice;

    private Laptop(LaptopBuilder builder) {
        this.brand = builder.brand;
        this.ram = builder.ram;
        this.ssd = builder.ssd;
        this.graphicsCard = builder.graphicsCard;
        this.extendedWarranty = builder.extendedWarranty;
        this.msOffice = builder.msOffice;
    }

    public void display() {
        System.out.println("------ Laptop Order Details ------");
        System.out.println("Brand: " + brand);
        System.out.println("RAM: " + ram);
        System.out.println("SSD: " + ssd);
        System.out.println("Graphics Card: " + graphicsCard);
        System.out.println("Extended Warranty: " + extendedWarranty);
        System.out.println("MS Office: " + msOffice);
    }

    public static class LaptopBuilder {

        private String brand;
        private String ram;

        private boolean ssd;
        private boolean graphicsCard;
        private boolean extendedWarranty;
        private boolean msOffice;

        public LaptopBuilder(String brand, String ram) {
            this.brand = brand;
            this.ram = ram;
        }

        public LaptopBuilder setSSD(boolean ssd) {
            this.ssd = ssd;
            return this;
        }

        public LaptopBuilder setGraphicsCard(boolean graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public LaptopBuilder setExtendedWarranty(boolean extendedWarranty) {
            this.extendedWarranty = extendedWarranty;
            return this;
        }

        public LaptopBuilder setMsOffice(boolean msOffice) {
            this.msOffice = msOffice;
            return this;
        }

        public Laptop build() {
            return new Laptop(this);
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Brand: ");
        String brand = sc.nextLine();

        System.out.print("Enter RAM: ");
        String ram = sc.nextLine();

        System.out.print("Add SSD? ");
        boolean ssd = sc.nextBoolean();

        System.out.print("Add Graphics Card? ");
        boolean graphics = sc.nextBoolean();

        System.out.print("Add Extended Warranty? ");
        boolean warranty = sc.nextBoolean();

        System.out.print("Add MS Office? ");
        boolean office = sc.nextBoolean();

        Laptop laptop = new Laptop.LaptopBuilder(brand, ram)
                .setSSD(ssd)
                .setGraphicsCard(graphics)
                .setExtendedWarranty(warranty)
                .setMsOffice(office)
                .build();

        laptop.display();
    }
}