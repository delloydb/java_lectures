import java.util.Scanner;

// creating Student class
class Student {
    private final String name;
    private final double marks;

    // creating a Constructor called by class name
    public Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }

    // Getting marks function from user
    public double getMarks() {
        return marks;
    }

    // a Method displaying student details
    public void displayDetails(String grade) {
        System.out.println("Student Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }
}

// GradeCalculator class
class GradeCalculator {
    // a Method for calculating grades of student
    public String calculateGrade(double marks) {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 75) {
            return "B";
        } else if (marks >= 50) {
            return "C";
        } else {
            return "D";
        }
    }
}

// a MainApp class
public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // taking user inputs name and marks
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student marks: ");
        double marks = scanner.nextDouble();

        // Creating Student object student
        Student student = new Student(name, marks);

        // Creating a GradeCalculator object to compute grades
        GradeCalculator calculator = new GradeCalculator();
        String grade = calculator.calculateGrade(student.getMarks());

        // Displaying student details with grade after computation
        student.displayDetails(grade);

        scanner.close();
    }
}
