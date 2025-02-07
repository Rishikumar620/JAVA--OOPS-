import java.util.Arrays;
import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n separated by spaces: ");
        String input = scanner.nextLine();
        String[] array = input.split(" ");
        int[] n = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            n[i] = Integer.parseInt(array[i]);
        }
        int Product = minproduct(n);
        System.out.println("Output: " + Product);
    }

    public static int minproduct(int[] arr) {
        Arrays.sort(arr);
        int product1 = arr[0] * arr[1];
        int product2 = arr[arr.length - 1] * arr[arr.length - 2];
        return Math.min(product1, product2);
    }
}