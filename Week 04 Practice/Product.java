public class Product {
    public String name;
    public int id, stock;
    public double price;

    public Product(String name, int id, double price, int stock) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.stock = stock;
    }
    public void applyDiscount(double disc) {
        if (disc > 0 && disc <= 100) {
            price -= price * (disc / 100);
        } else {
            System.out.println("Invalid discount percentage!");
        }
    }
    public void display() {
        System.out.println("Name: " + name + ", ID: " + id + ", Price: " + price + ", Stock: " + stock);
    }
    public static void main(String[] args) {
        Product p = new Product("Laptop", 101, 80000.0, 10);
        p.display();
        p.applyDiscount(10);
        System.out.println("After Discount:");
        p.display();
    }
}
