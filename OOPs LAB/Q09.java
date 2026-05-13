import java.util.ArrayList;
import java.util.Scanner;

// Student Class
class Student {

    int rollNo;
    String usn;
    String name;
    int semester;
    String mobile;

    // Constructor
    Student(int rollNo, String usn,
            String name, int semester,
            String mobile) {

        this.rollNo = rollNo;
        this.usn = usn;
        this.name = name;
        this.semester = semester;
        this.mobile = mobile;
    }

    // Display Method
    void display() {

        System.out.println("Roll No : " + rollNo);
        System.out.println("USN : " + usn);
        System.out.println("Name : " + name);
        System.out.println("Semester : " + semester);
        System.out.println("Mobile Number : " + mobile);

        System.out.println("---------------------------");
    }
}

// Main Class
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Initial Capacity = 15
        ArrayList<Student> students =
                new ArrayList<Student>(15);

        // Initially 5 Students Enrolled

        System.out.println("Enter Details of 5 Students\n");

        for(int i = 0; i < 5; i++) {

            System.out.println("Enter Student " + (i + 1) + " Details");

            System.out.print("Roll No : ");
            int roll = sc.nextInt();
            sc.nextLine();

            System.out.print("USN : ");
            String usn = sc.nextLine();

            System.out.print("Name : ");
            String name = sc.nextLine();

            System.out.print("Semester : ");
            int sem = sc.nextInt();
            sc.nextLine();

            System.out.print("Mobile Number : ");
            String mobile = sc.nextLine();

            students.add(new Student(
                    roll, usn, name, sem, mobile));

            System.out.println();
        }

        // Remove Roll No 3 and 5

        for(int i = 0; i < students.size(); i++) {

            int r = students.get(i).rollNo;

            if(r == 3 || r == 5) {

                students.remove(i);
                i--;
            }
        }

        // Add 2 More Students

        System.out.println(
                "Enter Details of 2 New Students\n");

        for(int i = 0; i < 2; i++) {

            System.out.println("Enter Student Details");

            System.out.print("Roll No : ");
            int roll = sc.nextInt();
            sc.nextLine();

            System.out.print("USN : ");
            String usn = sc.nextLine();

            System.out.print("Name : ");
            String name = sc.nextLine();

            System.out.print("Semester : ");
            int sem = sc.nextInt();
            sc.nextLine();

            System.out.print("Mobile Number : ");
            String mobile = sc.nextLine();

            students.add(new Student(
                    roll, usn, name, sem, mobile));

            System.out.println();
        }

        // Display Current Students

        System.out.println(
                "\nCurrently Enrolled Students\n");

        for(Student s : students) {

            s.display();
        }
    }
}
