public class PrimeDigits {
    public static void main(String[] args) {
        int n = 321875;
        System.out.print("Prime digits in the given value: ");
        
        for (; n > 0; n /= 10) {
            int digit = n % 10;
            if (digit == 2 || digit == 3 || digit == 5 || digit == 7) {
                System.out.print(digit);
                System.out.println();
            }
            //n=n/10;
        }
    }
}
