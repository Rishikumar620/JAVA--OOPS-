public class StockTracker {
    public static void main(String[] args) {
        // Each row represents [time, stock price]
        double[][] stocks = {
            {9.00, 150.50},
            {9.30, 152.75},
            {10.00, 151.25},
            {9.00, 300.00},
            {9.30, 302.50},
            {10.00, 301.75}
        };

        System.out.println("Time\tValue");

        for (double[] stock : stocks) {
            System.out.printf("%.2f\t%.2f%n", stock[0], stock[1]);
        }
    }
}
