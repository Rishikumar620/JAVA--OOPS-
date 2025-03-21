import java.util.InputMismatchException;
import java.util.Scanner;
class Exception{
    public static void main(String[] args) {

        // exception
        Scanner sc= new Scanner(System.in);
        try{
            System.out.println("Enter 2 numbers");
            int a = sc. nextInt();
            int b = sc.nextInt();
            int c = a/b;
            System.out.println("Result : "+c);
        }
        catch(InputMismatchException e){
            System.out.println("Exception : Invalid input Given"); 
        }
        catch(ArithmeticException e1){
            System.out.println("Cannot divide by 0");
        }





        /*  Scanner sc= new Scanner(System.in);
         System.out.println("Enter 2 numbers");
         int a = sc. nextInt();
         int b = sc.nextInt();
         int c = a+b;
         System.out.println("Result : "+c);
        */
    }
}