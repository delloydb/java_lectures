import java.util.Scanner; // Import the Scanner class for user input

public class CalculateDiscount {

    public static double getDiscount(int amount) { // Accepting amount as a parameter
        double discount = 0; // Initializing the discount variable

        if (amount > 5000) {
            discount = 0.1 * amount; // 10% discount for amounts over 5000
        } else if (amount >= 1000 && amount <= 5000) {
            discount = 0.05 * amount; // 5% discount for amounts between 1000 and 5000
        } else {
            System.out.println("No discount"); // Message for amounts less than 1000
        }

        return discount; // Returning the discount value
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input

        System.out.print("Enter the amount: "); // Prompt the user for input
        int amount = scanner.nextInt(); // Read the user's input

        double disc = getDiscount(amount); // Call the method with the user's input
        System.out.println("Discount is: " + disc); // Display the discount value as output

        scanner.close(); // Close the scanner to avoid resource leaks
    }
}
