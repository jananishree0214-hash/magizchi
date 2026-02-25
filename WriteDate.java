import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class WriteDate {
    public static void main(String[] args) {
        try {
            try (FileWriter fw = new FileWriter("date.txt")) {
                fw.write("Today's Date: " + LocalDate.now());
            }

            System.out.println("Date written to file");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}