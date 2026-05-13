import java.util.Scanner;

// Interface
interface Flyable {
    void fly();
}

// Abstract class
abstract class Animal {
    abstract void sound();
}

// Bird class
class Bird extends Animal implements Flyable {

    String name;

    // Constructor
    Bird(String name) {
        this.name = name;
    }

    // Implement abstract method
    void sound() {
        System.out.println(name + " makes chirping sound");
    }

    // Implement interface method
    public void fly() {
        System.out.println(name + " is flying in the sky");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter bird name: ");
        String name = sc.nextLine();

        Bird b = new Bird(name);

        b.sound();
        b.fly();
    }
}
