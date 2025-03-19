public class ArraySum {
   public static void main(String[] args) {
      int[] arr = {3, 7, 8, 2, 5, 6, 4};  
      int sum = 0;
      
      for (int i = 0; i < arr.length; i++) {  
         sum = sum + arr[i];
      }

      System.out.println("Sum: " + sum);
   }
}
