class Vehicle {

    int wheels;

    Vehicle(int wheels) {
        this.wheels = wheels;
    }

    void displayVehicle() {
        System.out.println("Number of Wheels: " + wheels);
    }
}

class Car extends Vehicle {

    String engineNo, chassisNo, manufacturer;

    Car(int wheels, String engineNo, String chassisNo, String manufacturer) {
        super(wheels);

        this.engineNo = engineNo;
        this.chassisNo = chassisNo;
        this.manufacturer = manufacturer;
    }

    void displayCar() {

        System.out.println("\n--- Car Details ---");

        displayVehicle();

        System.out.println("Engine Number: " + engineNo);
        System.out.println("Chassis Number: " + chassisNo);
        System.out.println("Manufacturer: " + manufacturer);
    }
}

class Bike extends Vehicle {

    String engineNo, chassisNo, manufacturer;

    Bike(int wheels, String engineNo, String chassisNo, String manufacturer) {
        super(wheels);

        this.engineNo = engineNo;
        this.chassisNo = chassisNo;
        this.manufacturer = manufacturer;
    }

    void displayBike() {

        System.out.println("\n--- Bike Details ---");

        displayVehicle();

        System.out.println("Engine Number: " + engineNo);
        System.out.println("Chassis Number: " + chassisNo);
        System.out.println("Manufacturer: " + manufacturer);
    }
}

class Truck extends Vehicle {

    String engineNo, chassisNo, manufacturer;

    Truck(int wheels, String engineNo, String chassisNo, String manufacturer) {
        super(wheels);

        this.engineNo = engineNo;
        this.chassisNo = chassisNo;
        this.manufacturer = manufacturer;
    }

    void displayTruck() {

        System.out.println("\n--- Truck Details ---");

        displayVehicle();

        System.out.println("Engine Number: " + engineNo);
        System.out.println("Chassis Number: " + chassisNo);
        System.out.println("Manufacturer: " + manufacturer);
    }
}

public class VehicleDemo {

    public static void main(String args[]) {

        Car c = new Car(4, "E101", "C101", "Toyota");

        Bike b = new Bike(2, "E202", "C202", "Honda");

        Truck t = new Truck(6, "E303", "C303", "Tata");

        c.displayCar();
        b.displayBike();
        t.displayTruck();
    }
}
