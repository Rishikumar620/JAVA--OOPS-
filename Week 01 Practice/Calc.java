import java.util.Scanner;

class Number {
    double n1, n2;

    public Number(double a, double b) {
        n1 = a;
        n2 = b;
    }

    public double add() {
        return n1 + n2;
    }

    public double subtract() {
        return n1 - n2;
    }

    public double multiply() {
        return n1 * n2;
    }

    public double divide() {
        if (n2 == 0) {
            System.out.println("Error");
            return 0;
        }
        return n1 / n2;
    }
}

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        Number numbers = new Number(num1, num2);
        System.out.println("\nChoose an operation:");
        System.out.println("1. (+)");
        System.out.println("2. (-)");
        System.out.println("3. (*)");
        System.out.println("4. (/)");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Result: " + numbers.add());
                break;
            case 2:
                System.out.println("Result: " + numbers.subtract());
                break;
            case 3:
                System.out.println("Result: " + numbers.multiply());
                break;
            case 4:
                System.out.println("Result: " + numbers.divide());
                break;
            default:
                System.out.println("Invalid choice! Please select a valid operation.");
        }

        scanner.close();
    }
}
