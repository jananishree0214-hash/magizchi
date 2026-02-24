
package trafficsignalsystem;

import java.util.Scanner;

enum TrafficSignal {
    RED, YELLOW, GREEN
}

public class TrafficSignalSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        TrafficSignal signal = TrafficSignal.RED; // default

        do {
            System.out.println("\n--- Traffic Signal System ---");
            System.out.println("1. Show Signal Meaning");
            System.out.println("2. Check Stop or Go");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("RED → Stop");
                    System.out.println("YELLOW → Ready");
                    System.out.println("GREEN → Go");
                }

                case 2 -> {
                    System.out.print("Enter signal (RED/YELLOW/GREEN): ");
                    signal = TrafficSignal.valueOf(sc.next().toUpperCase());

                    if (signal == TrafficSignal.RED)
                        System.out.println("STOP");
                    else
                        System.out.println("GO");
                }

                case 3 -> System.out.println("Exiting...");

                default -> System.out.println("Invalid choice");
            }
        } while (choice != 3);
    }
}