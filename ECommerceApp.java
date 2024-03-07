import java.util.ArrayList;
import java.util.Scanner;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class SignIn {
    private static final String[] validUsernames = {"user1", "user2", "user3"};
    private static final String[] validEmails = {"email1@gmail.com", "email2@gmail.com", "email3@gmail.com"};
    private static final String[] validPasswords = {"password1", "password2", "password3"};

    public static boolean signIn() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        for (int i = 0; i < validUsernames.length; i++) {
            if (username.equals(validUsernames[i]) && email.equals(validEmails[i]) && password.equals(validPasswords[i])) {
                System.out.println("Signed in successfully.");
                scanner.close();
                return true;
            }
        }

        System.out.println("Sign in failed. Invalid username, email, or password.");
        System.out.println("Please try again.");
        scanner.close();
        return false;
    }
}

class ShoppingCart {
    private ArrayList<Product> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addProduct(Product product) {
        items.add(product);
    }

    public void displayCart() {
        System.out.println("Shopping Cart:");
        double total = 0.0;
        for (Product item : items) {
            System.out.println(item.getName() + " - $" + item.getPrice());
            total += item.getPrice();
        }
        System.out.println("Total: $" + total);
    }
}

public class ECommerceApp {
    public static void main(String[] args) {
        boolean signedIn = false;

        while (!signedIn) {
            signedIn = SignIn.signIn();
        }

        // User signed in successfully, proceed with shopping cart
        Product product1 = new Product("torch", 10.99);
        Product product2 = new Product("laptop", 8.99);
        Product product3 = new Product("perfume", 12.99);

        ShoppingCart cart = new ShoppingCart();

        

        while (true) {
            System.out.println("1. Add Torch to Cart");
            System.out.println("2. Add Laptop to Cart");
            System.out.println("3. Add perfume to Cart");
            System.out.println("4. View Cart");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
           

            switch (choice) {
                case 1:
                    cart.addProduct(product1);
                    break;
                case 2:
                    cart.addProduct(product2);
                    break;
                case 3:
                    cart.addProduct(product3);
                    break;
                case 4:
                    cart.displayCart();
                    break;
                case 5:
                    System.out.println("Thank you for shopping with us!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
