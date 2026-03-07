
package rockpaperscissors;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors 
{
    public static void main(String[] args) 
    {

        try (Scanner sc = new Scanner(System.in)) 
        {
            Random rand = new Random();
            
            System.out.println("Rock Paper Scissors Game");
            System.out.println("1 - Rock");
            System.out.println("2 - Paper");
            System.out.println("3 - Scissors");
            
            System.out.print("Enter your choice: ");
            int userChoice = sc.nextInt();
            
            int computerChoice = rand.nextInt(3) + 1;
            
            System.out.println("Computer choice: " + computerChoice);
            
            if (userChoice == computerChoice) {
                System.out.println("It's a Draw!");
            }
            else if ((userChoice == 1 && computerChoice == 3) ||
                    (userChoice == 2 && computerChoice == 1) ||
                    (userChoice == 3 && computerChoice == 2)) 
            {
                System.out.println("You Win!");
            }
            else 
            {
                System.out.println("Computer Wins!");
            }
        }
    }
}