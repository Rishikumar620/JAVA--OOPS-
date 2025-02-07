public class Ascii {
    public static void main(String args[]) {
        System.out.println("ASCII values of numbers:");
        for (int num = 0; num <= 9; num++) {
            System.out.println("'" + num + "' -> " + (int) num);
        }
        System.out.println("ASCII values of Small letters:");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.println("'" + ch + "' -> " + (int) ch);
        }
        System.out.println("ASCII values of Capital letters:");
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.println("'" + ch + "' -> " + (int) ch);
        }
        System.out.println("ASCII values of special characters:");
        char[] specialChars = { '!', '@', '#', '$', '%', '^', '&', '*', '(', ')' };
        for (char ch : specialChars) {
            System.out.println("'" + ch + "' -> " + (int) ch);
        }
    }
}
