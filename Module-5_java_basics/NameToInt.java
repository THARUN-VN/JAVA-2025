import java.util.Scanner;

public class NameToInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        try {
            // Extract first 3 characters
            String firstThree = name.substring(0, 3);

            // Try converting to integer
            int number = Integer.parseInt(firstThree);

            System.out.println("Converted number: " + number);
        }
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: The name must have at least 3 characters.");
        }
        catch (NumberFormatException e) {
            System.out.println("Error: The first three characters are not numeric.");
        }
    }
}

