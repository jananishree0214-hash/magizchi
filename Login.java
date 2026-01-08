import java.util.Scanner;
class Login
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        String[] usernames = new String[10];
        String[] passwords = new String[10];
        int count = 0;
        int choice;
        do 
		{
            System.out.println("\n--- Menu ---");
            System.out.println("1. Registration");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) 
			{

                case 1:
                    System.out.print("Enter Username: ");
                    usernames[count] = sc.nextLine();
                    System.out.print("Enter Password: ");
                    passwords[count] = sc.nextLine();
                    count++;
                    System.out.println("Registration Successful");
                    break;

                case 2:
                    System.out.print("Enter Username: ");
                    String u = sc.nextLine();
                    System.out.print("Enter Password: ");
                    String p = sc.nextLine();

                    boolean loginSuccess = false;

                    for (int i = 0; i < count; i++) 
					{
                        if (usernames[i].equals(u) && passwords[i].equals(p)) 
						{
                            loginSuccess = true;
                            break;
                        }
                    }

                    if (loginSuccess) 
					{
                        System.out.println("Login Successful");
                    } 
					else 
					{
                        System.out.println("Invalid Username or Password");
                    }
                    break;

                case 3:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 3);

        sc.close();
    }
}