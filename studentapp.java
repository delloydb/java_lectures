import java.util.Scanner;

// i) StudentRecord Class
class StudentRecord {
    private int studentID;
    private String name;
    private String course;

    // Constructor to initialize the fields
    public StudentRecord(int studentID, String name, String course) {
        this.studentID = studentID;
        this.name = name;
        this.course = course;
    }

    // Method to display student details
    public void displayInfo() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
    }
}

// ii) StudentApp Class
public class StudentApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input student details
        System.out.print("Enter Student ID: ");
        int studentID = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Course: ");
        String course = scanner.nextLine();

        // Instantiate a StudentRecord object using user-provided data
        StudentRecord student = new StudentRecord(studentID, name, course);

        // Call the displayInfo method to display student details
        System.out.println("\nStudent Details:");
        student.displayInfo();

        scanner.close(); // Close the scanner to prevent resource leaks
    }
}
