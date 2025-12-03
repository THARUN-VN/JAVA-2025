import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadFileExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));

            // Read the first line
            String firstLine = reader.readLine();
            System.out.println("First line: " + firstLine);

            reader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("Error: The file \"" + fileName + "\" was not found.");
        }
        catch (IOException e) {
            System.out.println("Error: Unable to read from the file.");
        }
    }
}
