public class Patt {
    public static void main(String args[]) {
        for (int i = 0; i <= 8; i++) {

            if (i % 2 != 0) {
                System.out.print("* ");
                // System.out.print("\n");

            } else
                for (int j = 0; j <= i; j++) {
                    System.out.print("* ");
                }
            System.out.print("\n");

        }

    }
}
