public class CalculateDiscount {

    public static double GetDiscount(int amount) {

        double discount = 0; // initializing the discount variable

        if (amount > 5000) {
            discount = 0.1 * amount;
        } // 10% discount for amounts over 5000

        else if (amount >= 1000) {
            discount = 0.05 * amount;
        } // 5% discount for amounts between 1000 and 5000
        else {
            System.out.println("No discount");
        }

        return discount; // returning the discount value
    }

    public static void main(String[] args) {

        double disc = GetDiscount(7000); // Calling the method with the amount parameter

        System.out.println("Discount is: " + disc); // Displaying the discount value as output
    }
}
