import java.util.Scanner;

// i) Base class Vehicle
class Vehicle {
    private String brand;
    private String model;
    private int year;

    // Constructor to initialize the fields
    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Method to display vehicle details
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

// ii) Subclass Car that inherits from Vehicle
class Car extends Vehicle {
    private String fuelType;

    // Constructor to initialize all fields
    public Car(String brand, String model, int year, String fuelType) {
        super(brand, model, year); // Call the constructor of the superclass (Vehicle)
        this.fuelType = fuelType;
    }

    // Overriding displayDetails method to include fuelType
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call the superclass method to display common details
        System.out.println("Fuel Type: " + fuelType);
    }
}

// iii) Showroom class
public class Showroom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input car details
        System.out.print("Enter Brand: ");
        String brand = scanner.nextLine();

        System.out.print("Enter Model: ");
        String model = scanner.nextLine();

        System.out.print("Enter Year: ");
        int year = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        System.out.print("Enter Fuel Type: ");
        String fuelType = scanner.nextLine();

        // Instantiate a Car object using user-provided data
        Car car = new Car(brand, model, year, fuelType);

        // Call the displayDetails method to display car details
        System.out.println("\nCar Details:");
        car.displayDetails();

        scanner.close(); // Close the scanner to prevent resource leaks
    }
}
