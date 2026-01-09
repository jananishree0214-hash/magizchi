import java.util.Scanner;

class Bank
{
    float balance;

    void inputBalance()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter initial balance: ");
        balance = sc.nextFloat();
    }

    void deposit()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter deposit amount: ");
        float amount = sc.nextFloat();

        balance = balance + amount;
        System.out.println("Amount Deposited");
        System.out.println("New Balance: " + balance);
    }

    void withdraw()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter withdraw amount: ");
        float amount = sc.nextFloat();

        if (amount <= balance)
        {
            balance = balance - amount;
            System.out.println("Amount Withdrawn");
            System.out.println("New Balance: " + balance);
        }
        else
        {
            System.out.println("Insufficient Balance");
        }
    }

    void displayBalance()
    {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args)
    {
        Bank b = new Bank();
        Scanner sc = new Scanner(System.in);
        int choice;

        b.inputBalance();

        do
        {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    b.deposit();
                    break;

                case 2:
                    b.withdraw();
                    break;

                case 3:
                    b.displayBalance();
                    break;

                case 4:
                    System.out.println("Exiting Program...");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        } while(choice != 4);
    }
}