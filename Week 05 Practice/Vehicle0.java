//Create a base class Vehicle with attributes like model and year. Create a subclass Car that inherits from Vehicle and has additional attributes like numDoors and fuelType.
class Vehicle {
    String model;
    String year;

    Vehicle(String model, String year) {
        this.model = model;
        this.year = year;
    }
}

class Car extends Vehicle {
    String numDoors;
    String fuelType;

    Car(String model, String year, String numDoors, String fuelType) {
        super(model, year);
        this.numDoors = numDoors;
        this.fuelType = fuelType;
    }

    void displayInfo() {
        System.out.println("Model: " + model + ", Year: " + year + ", Doors: " + numDoors + ", Fuel Type: " + fuelType);
    }
}
    public class Vehicle0 {
        public static void main(String[] args) {
            Car car = new Car("Hundai", "2022", "4", "Petrol");
            Car car1 = new Car("Skorpio", "2018", "4", "Petrol");
            car.displayInfo();
            car1.displayInfo();
        }
    }
