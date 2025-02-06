import java.util.Scanner;

// Employee class
class Employee {
    private String name;
    private double salary;

    // Constructor to initialize attributes
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Getter method for salary
    public double getSalary() {
        return salary;
    }

    // a Method displaying employee details
    public void displayDetails(double bonus) {
        System.out.println("\nEmployee Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + bonus);
    }
}

// creating SalaryCalculator class
class SalaryCalculator {
    // a Method to calculate 10% bonus of the salary
    public double calculateBonus(double salary) {
        return salary * 0.10;
    }
}

// creating Main class
public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // taking name and salary amounts as  user input
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter employee salary: ");
        double salary = scanner.nextDouble();

        // Creating an Employee object
        Employee employee = new Employee(name, salary);

        // Creating a SalaryCalculator object to compute the bonus
        SalaryCalculator calculator = new SalaryCalculator();
        double bonus = calculator.calculateBonus(employee.getSalary());

        // Displaying employee details with calculated bonus
        employee.displayDetails(bonus);

        scanner.close();
    }
}
