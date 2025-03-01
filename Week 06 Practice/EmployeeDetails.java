class Employee {
    private String name;
    private int id;
    private String department;
    private double salary;

    // Constructor with only name and ID
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Constructor with name, ID, and department
    Employee(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    // Constructor with name, ID, department, and salary
    Employee(String name, int id, String department, double salary) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.salary = salary;
    }

    // Method to display employee details
    void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        if (department != null) {
            System.out.println("Department: " + department);
        }
        if (salary > 0) {
            System.out.println("Salary: $" + salary);
        }
        System.out.println(" ");
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Rishi", 101);
        Employee emp2 = new Employee("Amlan", 102, "HR");
        Employee emp3 = new Employee("Harsh", 103, "Finance", 3000);

        emp1.display();
        emp2.display();
        emp3.display();
    }
}