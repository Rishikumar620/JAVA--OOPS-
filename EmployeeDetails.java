import java.util.Scanner;

class Employee {
    int id;
    String name;
    double salary;

    void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee[] employees = new Employee[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");
            employees[i] = new Employee();
            System.out.print("Enter ID: ");
            employees[i].id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter Name: ");
            employees[i].name = scanner.nextLine();
            System.out.print("Enter Salary: ");
            employees[i].salary = scanner.nextDouble();
        }
        System.out.println("\nEmployee Details:");
        for (int i = 0; i < 5; i++) {
            employees[i].displayDetails();
        }
        scanner.close();
    }
}
