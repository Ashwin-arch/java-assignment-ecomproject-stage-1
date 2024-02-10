import java.util.Scanner;

class User {
    String username;
    String password;
    
    User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}

public class Testuser {
    public static void main(String[] args) {
        User user1 = new User("user1", "password1");
        User user2 = new User("user2", "password2");
        User user3 = new User("user3", "password3");
        
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for name and password
        System.out.print("Enter the name: ");
        String name = scanner.nextLine();
        System.out.print("Enter the password: ");
        String password = scanner.nextLine();
        
        // Check if input matches any user's credentials
        if ((name.equals(user1.username) && password.equals(user1.password)) ||
            (name.equals(user2.username) && password.equals(user2.password)) ||
            (name.equals(user3.username) && password.equals(user3.password))) {
            System.out.println("Signed in successfully");
        } else {
            System.out.println("Sign in failed");
        }
        
        scanner.close();
    }
}
