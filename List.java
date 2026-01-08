import java.util.Scanner;
class List
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of students: ");
        int n = sc.nextInt();
        String[] students = new String[n];
        int choice;
        int index = 0;

        do {
            System.out.println("1. Add Student");
            System.out.println("2. View Student List");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                   case 1:
                    if (index < n) 
					{
                        System.out.print("Enter student name: ");
                        students[index] = sc.next();
                        index++;
                    } else 
					{
                        System.out.println("Student list is full");
                    }
                    break;

                 case 2:
                    System.out.println("Student List:");
                    for (int i = 0; i < index; i++) 
					{
                        System.out.println((i + 1) + ". " + students[i]);
                    }
                    break;

                case 3:
                    System.out.println("Exit program");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 3);
    }
}