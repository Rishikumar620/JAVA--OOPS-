public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr = {3, 7, 8, 2, 5, 6, 4};  
        
        System.out.print("Reversed Array: ");
        for (int i = arr.length - 1; i >= 0; i--) {  
            System.out.print(arr[i] + " "); 
        }
    }
}
