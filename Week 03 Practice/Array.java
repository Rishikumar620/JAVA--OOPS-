
//sort the element of array and place in ascending order and multiply the highest 3 elements
import java.util.Arrays;

public class Array {
    public static void main() {
        int[] a = { 1, 2, 4, 9, 3 };
        Array.Sort(a);
        int max1 = a[a.length - 1];
        int max2 = a[a.length - 2];
        int max3 = a[a.length - 3];
        System.out.println(max1 * max2 * max3);

    }
}
