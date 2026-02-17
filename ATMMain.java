import java.util.Scanner;

public class ATMMain 
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int balance = 5000;

        while (true) {
            System.out.println("\n--- ATM MENU ---");
            System.out.println("1. Withdraw");
            System.out.println("2. Check Balance");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            try {
                switch (choice) {

                    case 1:
                        System.out.print("Enter amount: ");
                        int amount = sc.nextInt();

                        if (amount > balance)
                            throw new InsufficientBalanceException("Insufficient Balance!");

                        balance -= amount;
                        System.out.println("Please collect your cash");
                        break;

                    case 2:
                        System.out.println("Current Balance: " + balance);
                        break;

                    case 3:
                        System.out.println("Thank you for using ATM");
                        System.exit(0);

                    default:
                        System.out.println("Invalid choice");
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
}

    private static class InsufficientBalanceException extends Exception 
    {

        public InsufficientBalanceException(String insufficient_Balance) {
        }
    }
}