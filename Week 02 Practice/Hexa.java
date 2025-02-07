
// Write a java program to design a menu driven program to convert a number to its equivalent 
// hexadecimal and binary format
import java.util.Scanner;

public class Hexa {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter a number:");
        n = sc.nextInt();
        System.out.println("hexadecimal number is: " + Integer.toHexString(n));
        System.out.println("binary number is: " + Integer.toBinaryString(n));

    }
}
