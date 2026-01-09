import java.util.Scanner;

class Result
{
    int m1, m2, m3;
    int total;
    float percentage;

    void inputMarks()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Subject 1 marks: ");
        m1 = sc.nextInt();
        System.out.print("Enter Subject 2 marks: ");
        m2 = sc.nextInt();
        System.out.print("Enter Subject 3 marks: ");
        m3 = sc.nextInt();
    }

    int calculateTotal()
    {
        total = m1 + m2 + m3;
        return total;
    }

    float calculatePercentage()
    {
        percentage = total / 3.0f;
        return percentage;
    }

    String displayResult()
    {
        if (percentage >= 40)
            return "PASS";
        else
            return "FAIL";
    }

    String displayGrade()
    {
        if (percentage >= 75)
            return "A";
        else if (percentage >= 60)
            return "B";
        else if (percentage >= 40)
            return "C";
        else
            return "F";
    }

    public static void main(String[] args)
    {
        Result r = new Result();
        Scanner sc = new Scanner(System.in);
        int choice;

        r.inputMarks();

        do
        {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Display Total");
            System.out.println("2. Display Percentage");
            System.out.println("3. Display Result");
            System.out.println("4. Display Grade");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.println("Total Marks : " + r.calculateTotal());
                    break;

                case 2:
                    System.out.println("Percentage : " + r.calculatePercentage());
                    break;

                case 3:
                    System.out.println("Result : " + r.displayResult());
                    break;

                case 4:
                    System.out.println("Grade : " + r.displayGrade());
                    break;

                case 5:
                    System.out.println("Exit...");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        } while(choice != 5);
    }
}