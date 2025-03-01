//A class 'Box' which contains methods and other details(width, height, depth) to calculate volume. Another class Boxweight contains method for finding cost for shipping the box using weight of the box (formula to find cost of shipping= distance in km * volume * cost per km)Take cost per KM by the user.WAP to find the volume of box and cost to ship using a single object
import java.util.Scanner;

class Box {
    double width;
    double height;
    double depth;

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double calculateVolume() {
        return width * height * depth;
    }
}

class BoxWeight extends Box {
    double weight;

    BoxWeight(double w, double h, double d, double wt) {
        super(w, h, d);
        weight = wt;
    }

    double calculateShippingCost(double distance, double costPerKm) {
        return distance * weight * costPerKm;
    }
}

public class BoxMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter box width: ");
        double width = scanner.nextDouble();
        System.out.print("Enter box height: ");
        double height = scanner.nextDouble();
        System.out.print("Enter box depth: ");
        double depth = scanner.nextDouble();
        System.out.print("Enter box weight: ");
        double weight = scanner.nextDouble();

        BoxWeight myBox = new BoxWeight(width, height, depth, weight);

        System.out.print("Enter shipping distance (km): ");
        double distance = scanner.nextDouble();
        System.out.print("Enter cost per km: ");
        double costPerKm = scanner.nextDouble();

        double volume = myBox.calculateVolume();
        double shippingCost = myBox.calculateShippingCost(distance, costPerKm);

        System.out.println("\nBox Volume: " + volume);
        System.out.println("Shipping Cost: " + shippingCost);

        scanner.close();
    }
}
