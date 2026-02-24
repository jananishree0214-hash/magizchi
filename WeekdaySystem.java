package weekdaysystem;


import java.util.Scanner;

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY,
    SATURDAY, SUNDAY
}

public class WeekdaySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Weekday Working System ---");
            System.out.println("1. Check if day is Working Day");
            System.out.println("2. Check if day is Weekend");
            System.out.println("3. Display All Days");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter day: ");
                    Day day = Day.valueOf(sc.next().toUpperCase());

                    if (day == Day.SATURDAY || day == Day.SUNDAY)
                        System.out.println("Not a Working Day");
                    else
                        System.out.println("Working Day");
                    break;

                case 2:
                    System.out.print("Enter day: ");
                    day = Day.valueOf(sc.next().toUpperCase());

                    if (day == Day.SATURDAY || day == Day.SUNDAY)
                        System.out.println("Weekend");
                    else
                        System.out.println("Weekday");
                    break;

                case 3:
                    System.out.println("Days of the Week:");
                    for (Day d : Day.values())
                        System.out.println(d);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 4);
    }
}