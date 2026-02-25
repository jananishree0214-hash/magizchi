import java.io.*;

public class UpperCaseFile {
    public static void main(String[] args) {
        try {
            BufferedWriter bw;
            try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
                bw = new BufferedWriter(new FileWriter("output.txt"));
                String line;
                while ((line = br.readLine()) != null) {
                    bw.write(line.toUpperCase());
                    bw.newLine();
                }
            }
            bw.close();
            System.out.println("Converted to uppercase successfully");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}