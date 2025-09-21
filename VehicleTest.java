// Base class
class Vehicle {
    String make;
    String model;
    int year;
    String fuelType;

    void displayInfo() {
        System.out.println(year + " " + make + " " + model + " (" + fuelType + ")");
    }

    void fuelEfficiency() {
        System.out.println("Fuel efficiency varies for each vehicle.");
    }

    void distanceTravelled(int speed, int time) {
        int distance = speed * time;
        System.out.println("Distance travelled: " + distance + " km");
    }

    void maxSpeed() {
        System.out.println("Max speed depends on vehicle type.");
    }
}

// Subclass: Truck
class Truck extends Vehicle {
    void fuelEfficiency() {
        System.out.println("Truck fuel efficiency: 6 km/l");
    }

    void maxSpeed() {
        System.out.println("Truck max speed: 120 km/h");
    }
}

// Subclass: Car
class Car extends Vehicle {
    void fuelEfficiency() {
        System.out.println("Car fuel efficiency: 15 km/l");
    }

    void maxSpeed() {
        System.out.println("Car max speed: 180 km/h");
    }
}

// Subclass: Motorcycle
class Motorcycle extends Vehicle {
    void fuelEfficiency() {
        System.out.println("Motorcycle fuel efficiency: 40 km/l");
    }

    void maxSpeed() {
        System.out.println("Motorcycle max speed: 160 km/h");
    }
}

// Main class to test the hierarchy
public class VehicleTest {
    public static void main(String[] args) {
        Truck t = new Truck();
        t.make = "Volvo";
        t.model = "FH16";
        t.year = 2020;
        t.fuelType = "Diesel";
        t.displayInfo();
        t.fuelEfficiency();
        t.distanceTravelled(60, 2);
        t.maxSpeed();

        System.out.println();

        Car c = new Car();
        c.make = "Toyota";
        c.model = "Corolla";
        c.year = 2022;
        c.fuelType = "Petrol";
        c.displayInfo();
        c.fuelEfficiency();
        c.distanceTravelled(80, 3);
        c.maxSpeed();

        System.out.println();

        Motorcycle m = new Motorcycle();
        m.make = "Honda";
        m.model = "CBR";
        m.year = 2021;
        m.fuelType = "Petrol";
        m.displayInfo();
        m.fuelEfficiency();
        m.distanceTravelled(70, 1);
        m.maxSpeed();
    }
}
