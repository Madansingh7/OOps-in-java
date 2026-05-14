import java.util.Scanner;

class Student<T> implements Comparable<Student<T>> {

    T usn;
    String firstName;
    String lastName;
    String branch;
    String division;

    // Constructor
    Student(T usn, String firstName, String lastName,
            String branch, String division) {

        this.usn = usn;
        this.firstName = firstName;
        this.lastName = lastName;
        this.branch = branch;
        this.division = division;
    }

    // compareTo() for USN sorting
    public int compareTo(Student<T> s) {
        return this.usn.toString().compareTo(s.usn.toString());
    }

    // Display method
    void display() {
        System.out.println(usn + "  " + firstName + "  "
                + lastName + "  " + branch + "  " + division);
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student<String> s[] = new Student[3];

        // Input
        s[0] = new Student<String>("4SU23CS003", "Rahul", "Patil", "CSE", "B");
        s[1] = new Student<String>("4SU23CS001", "Aman", "Kumar", "ISE", "A");
        s[2] = new Student<String>("4SU23CS002", "Vikas", "Sharma", "CSE", "C");

        System.out.println("1. Sort by USN");
        System.out.println("2. Sort by First Name");
        System.out.println("3. Sort by Division");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        // Bubble Sort
        for(int i = 0; i < s.length - 1; i++) {

            for(int j = 0; j < s.length - i - 1; j++) {

                boolean swap = false;

                if(choice == 1) {

                    if(s[j].compareTo(s[j + 1]) > 0)
                        swap = true;

                } else if(choice == 2) {

                    if(s[j].firstName.compareTo(s[j + 1].firstName) > 0)
                        swap = true;

                } else if(choice == 3) {

                    if(s[j].division.compareTo(s[j + 1].division) > 0)
                        swap = true;
                }

                if(swap) {

                    Student<String> temp = s[j];
                    s[j] = s[j + 1];
                    s[j + 1] = temp;
                }
            }
        }

        System.out.println("\nSorted Student Details:");

        for(int i = 0; i < s.length; i++) {
            s[i].display();
        }
    }
}