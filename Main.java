// Parent Class: Vehicle
class Vehicle {
    // Method to be overridden
    void drive() {
        System.out.println("Driving a vehicle...");
    }
}

// Subclass: Car (Overriding the drive method)
class Car extends Vehicle {
    
    void drive() {
        System.out.println("Repairing a car");
    }
}

// Main class to test functionality
public class Main {
    public static void main(String[] args) {
        Vehicle myCar = new Car(); // Creating an instance of Car
        myCar.drive(); // Calls the overridden method in Car
    }
}
