/* A vehicle is identified by how many wheels it has. A car is identified by engine number,  
chassis number and manufacturer. A bike is identified by engine number, chassis number  
and manufacturer. Similarly, a truck is identified by engine number, chassis number and  
manufacturer. Car is-a vehicle, bike is-a vehicle and Truck is-a vehicle. Using this  
information, write a Java Program that displays all the information of vehicle, car, bike and  
truck. Also draw the class diagram for the above scenario. */

        //         Vehicle
        // -------------------------
        // wheels
        // engineNumber
        // chassisNumber
        // manufacturer
        // -------------------------
        // displayVehicle()
        // -------------------------
        //    /        |        \
        //   /         |         \
        // Car        Bike      Truck

import java.util.Scanner;

class Vehicles {
    int wheels;
    String engineNo, chassisNo, manufacturer;

    void getDetails(Scanner sc) {
        System.out.print("Enter number of wheels: ");
        wheels = sc.nextInt();

        System.out.print("Enter engine number: ");
        engineNo = sc.next();

        System.out.print("Enter chassis number: ");
        chassisNo = sc.next();

        System.out.print("Enter manufacturer: ");
        manufacturer = sc.next();
    }

    void displayDetails() {
        System.out.println("Wheels: " + wheels);
        System.out.println("Engine Number: " + engineNo);
        System.out.println("Chassis Number: " + chassisNo);
        System.out.println("Manufacturer: " + manufacturer);
    }
}

class Car extends Vehicles {}
class Bike extends Vehicles {}
class Truck extends Vehicles {}

public class Vechicle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter Car Details");
        Car c = new Car();
        c.getDetails(sc);

        System.out.println("\nCar Information");
        c.displayDetails();

        System.out.println("\nEnter Bike Details");
        Bike b = new Bike();
        b.getDetails(sc);

        System.out.println("\nBike Information");
        b.displayDetails();

        System.out.println("\nEnter Truck Details");
        Truck t = new Truck();
        t.getDetails(sc);

        System.out.println("\nTruck Information");
        t.displayDetails();

        sc.close();
    }
}
