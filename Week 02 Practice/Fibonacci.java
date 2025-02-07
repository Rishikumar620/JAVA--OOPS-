import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        System.out.println("Non-Recursive Fibonacci:");
        nonRecursive(n);
        System.out.println("\nRecursive Fibonacci:");
        for (int i = 0; i < n; i++) {
            System.out.print(Recursive(i) + " ");
        }
        sc.close();
    }

    public static void nonRecursive(int n) {
        int first = 0, second = 1;
        for (int i = 0; i < n; i++) {
            if (i <= 1) {
                System.out.print(i + " ");
            } else {
                int next = first + second;
                System.out.print(next + " ");
                first = second;
                second = next;
            }
        }
    }

    public static int Recursive(int n) {
        if (n <= 1) {
            return n;
        }
        return Recursive(n - 1) + Recursive(n - 2);
    }
}
