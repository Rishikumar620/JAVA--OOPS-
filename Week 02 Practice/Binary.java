import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.println("Binary: " + toBinary(number));
        System.out.println("Hexadecimal: " + toHexadecimal(number));
        sc.close();
    }

    public static String toBinary(int num) {
        String binary = "";
        while (num > 0) {
            binary = (num % 2) + binary;
            num = num / 2;
        }
        return binary.isEmpty() ? "0" : binary;
    }

    public static String toHexadecimal(int num) {
        String hex = "";
        char[] hexChars = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };

        while (num > 0) {
            hex = hexChars[num % 16] + hex;
            num = num / 16;
        }
        return hex.isEmpty() ? "0" : hex;
    }
}
