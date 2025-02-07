public class Operator {
    public static void main(String args[]) {
        int a = 12, b = 3;
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("a / b = " + (a / b)); // Division
        System.out.println("a % b = " + (a % b)); // Modulus (remainder)

        System.out.println("Relational Operators:");
        System.out.println("a == b: " + (a == b)); // Equal to
        System.out.println("a != b: " + (a != b)); // Not equal to
        System.out.println("a > b: " + (a > b)); // Greater than
        System.out.println("a < b: " + (a < b)); // Less than
        System.out.println("a >= b: " + (a >= b)); // Greater than or equal to
        System.out.println("a <= b: " + (a <= b)); // Less than or equal to

        System.out.println("Logical Operators:");
        System.out.println("a > b && a != b: " + (a > b && a != b)); // AND operator
        System.out.println("a > b || a == b: " + (a > b || a == b)); // OR operator
        System.out.println("!(a == b): " + !(a == b)); // NOT operator
    }
}
