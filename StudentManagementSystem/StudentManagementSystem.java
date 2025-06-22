import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private int rollNo;
    private String name;
    private String course;

    public Student(int rollNo, String name, String course) {
        this.rollNo = rollNo;
        this.name = name;
        this.course = course;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("--------------------------------");
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        boolean exit = false;
        while (!exit) {
            System.out.println("\n---> Menu <---");
            System.out.println("1. Add Student");
            System.out.println("2. View all Student");
            System.out.println("3. Delete Student by Roll no");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    try {
                        System.out.print("Enter Roll No: ");
                        int roll = Integer.parseInt(scanner.nextLine());
                        System.out.print("Enter Name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter Course: ");
                        String course = scanner.nextLine();
                        students.add(new Student(roll, name, course));
                        System.out.println("Student added successfully");
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid Roll number. please enter valid details");

                    }
                    break;
                case "2":
                    if (students.isEmpty()) {
                        System.out.println("\n No students to display");
                    } else {
                        System.out.println("\n---> Students List <---");
                        for (Student s : students) {
                            s.display();
                        }
                    }
                    break;
                case "3":
                    boolean validInput = false;
                    int rollToDelete = -1;
                    while (!validInput) {
                        System.out.print("Enter Roll No to delete: ");
                        try {
                            rollToDelete = Integer.parseInt(scanner.nextLine());
                            validInput = true;
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid roll number. Please enter a valid integer.");
                        }
                    }
                    boolean found = false;
                    for (Student s : students) {
                        if (s.getRollNo() == rollToDelete) {
                            students.remove(s);
                            System.out.println("Student with Roll No " + rollToDelete + " deleted");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Student not found");
                    }
                    break;
                case "4":
                    exit = true;
                    System.out.println("Exiting Student Management System.");
                    break;
                default:
                    System.out.println("Invalid choice. Please Select between 1 and 4.");

            }
        }
        scanner.close();
    }
}