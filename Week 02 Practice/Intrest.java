import java.util.Scanner;

public class Intrest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the initial principal amount: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter the rate of interest (in %): ");
        double rate = scanner.nextDouble();
        System.out.print("Enter the time (in years): ");
        double time = scanner.nextDouble();
        double interest = (principal * rate * time) / 100;
        double finalAmount = principal + interest;
        System.out.println("\nInterest: " + interest);
        System.out.println("Final Amount: " + finalAmount);
        scanner.close();
    }
}
