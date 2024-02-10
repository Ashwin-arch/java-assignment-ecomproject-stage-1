import java.util.Scanner;

class Use{
    String username;
    String password;
    String email;
    
    Use(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }
}

public class Testclass {
    public static void main(String[] args) {
        
        Use user1 = new Use("user1", "password1", "email1@gmail.com");
        Use user2 = new Use("user2", "password2", "email2@gmail.com");
        Use user3 = new Use("user3", "password3", "email3@gmail.com");
        
        Scanner scanner = new Scanner(System.in);
        
        boolean signedIn = false;
        
        while (!signedIn) {
            // Prompt user for name, email, and password
            System.out.print("Enter the name: ");
            String name = scanner.nextLine();
            System.out.print("Enter the email: ");
            String email = scanner.nextLine();
            System.out.print("Enter the password: ");
            String password = scanner.nextLine();
            
            // Check if input matches any user's credentials
            if ((name.equals(user1.username) && email.equals(user1.email) && password.equals(user1.password)) ||
                (name.equals(user2.username) && email.equals(user2.email) && password.equals(user2.password)) ||
                (name.equals(user3.username) && email.equals(user3.email) && password.equals(user3.password))) {
                System.out.println("Signed in successfully");
                signedIn = true;
            } else {
                System.out.println("Sign in failed. Please try again.");
            }
            
            
            if (!signedIn) {
                System.out.println("Enter the email again:");
                email = scanner.nextLine();
            }
        }
        
        scanner.close();
    }
}
