import java.util.Scanner;

// Superclass
class User {

    int id;
    String name;

    // Constructor
    User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Display common details
    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

// Doctor subclass
class Doctor extends User {

    String specialization;

    // Constructor using super keyword
    Doctor(int id, String name, String specialization) {

        super(id, name);

        this.specialization = specialization;
    }

    // Unique method
    void prescribeMedicine() {

        System.out.println(name + " is prescribing medicine");
    }

    void showDoctor() {

        System.out.println("\nDoctor Details");
        display();
        System.out.println("Specialization: " + specialization);
    }
}

// Patient subclass
class Patient extends User {

    String disease;

    // Constructor using super keyword
    Patient(int id, String name, String disease) {

        super(id, name);

        this.disease = disease;
    }

    // Unique method
    void requestAppointment() {

        System.out.println(name + " requested an appointment");
    }

    void showPatient() {

        System.out.println("\nPatient Details");
        display();
        System.out.println("Disease: " + disease);
    }
}

// Main class
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Doctor Input
        System.out.println("Enter Doctor ID:");
        int did = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Doctor Name:");
        String dname = sc.nextLine();

        System.out.println("Enter Specialization:");
        String spec = sc.nextLine();

        Doctor d = new Doctor(did, dname, spec);

        // Patient Input
        System.out.println("\nEnter Patient ID:");
        int pid = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Patient Name:");
        String pname = sc.nextLine();

        System.out.println("Enter Disease:");
        String disease = sc.nextLine();

        Patient p = new Patient(pid, pname, disease);

        // Output
        d.showDoctor();
        d.prescribeMedicine();

        p.showPatient();
        p.requestAppointment();
    }
}
