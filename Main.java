import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String storedUsername = "username";
        String storedPassword = "password";
        
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for name and password
        System.out.print("Enter the name: ");
        String name = scanner.nextLine();
        System.out.print("Enter the password: ");
        String password = scanner.nextLine();
        
        // Check if input matches predefined values
        if (name.equals(storedUsername) && password.equals(storedPassword)) {
            System.out.println("Signed in successfully");
        } else {
            System.out.println("Sign in failed");
        }
        
        scanner.close();
    }
}
