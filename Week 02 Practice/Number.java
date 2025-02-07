import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int sum = 0, temp = number;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        System.out.println("Sum of digits: " + sum);

        boolean isPrime = (sum > 1);
        for (int i = 2; i <= Math.sqrt(sum); i++) {
            if (sum % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println("Prime: " + (isPrime ? "Y" : "N"));
        int armstrongSum = 0, tempSum = sum;
        int digits = String.valueOf(sum).length();
        while (tempSum > 0) {
            int digit = tempSum % 10;
            armstrongSum += Math.pow(digit, digits);
            tempSum /= 10;
        }
        System.out.println("Armstrong: " + (armstrongSum == sum ? "Y" : "N"));
        int perfectSum = 0;
        for (int i = 1; i < sum; i++) {
            if (sum % i == 0) {
                perfectSum += i;
            }
        }
        System.out.println("Perfect: " + (perfectSum == sum ? "Y" : "N"));

        sc.close();
    }
}
