import java.util.Scanner;

// Custom Exception
class InvalidEmailException extends Exception {
    public InvalidEmailException(String message) {
        super(message);
    }
}

public class EmailValidator {
    
    // Method to validate email
    public static void validateEmail(String email) throws InvalidEmailException {
        if (!email.contains("@")) {
            throw new InvalidEmailException("Invalid Email: '@' symbol missing.");
        }
        System.out.println("Email is valid!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your email: ");
        String email = sc.nextLine();

        try {
            validateEmail(email);
        }
        catch (InvalidEmailException e) {
            System.out.println(e.getMessage());
        }
    }
}
