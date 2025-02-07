import java.util.Scanner;

public class Pattern0 {
    public static void Pattern(int n) {
        char ch = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            ch = 'A';
            for (int k = 1; k <= i; k++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();
        Pattern(n);
    }
}
