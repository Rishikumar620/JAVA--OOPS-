import java.util.Scanner;
public class Zeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numbers separated by spaces: ");
        String input = scanner.nextLine();
        String[] Array = input.split(" ");
        int[] result = new int[Array.length];
        int i = 0;
        for (String s : Array) {
            int num = Integer.parseInt(s);
            if (num != 0) {
                result[i] = num;
                i++;
            }
        }
        while (i < result.length) {
            result[i] = 0;
            i++;
        }
        System.out.print("Output: ");
        for (int num : result) {
            System.out.print(num);
        }
    }
}