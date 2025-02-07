import java.util.Scanner;

public class Sum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int odd = 0, even = 0;
        while (n != 0) {
            int r = n % 10;
            if (r % 2 == 0) {
                even += r;
            } else {
                odd += r;
            }
            n = n / 10;
        }
        System.out.println("Sum of odd digits -> " + odd);
        System.out.println("Sum of even digits ->" + even);

    }

}
