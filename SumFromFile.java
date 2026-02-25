import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SumFromFile {
    public static void main(String[] args) {
        try {
            File file = new File("numbers.txt");
            try (Scanner sc = new Scanner(file)) {
                int sum = 0;
                
                while (sc.hasNextInt()) {
                    sum += sc.nextInt();
                }
                
                System.out.println("Sum = " + sum);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e);
        }
    }
}