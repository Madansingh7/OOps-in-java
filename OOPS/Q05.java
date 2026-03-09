/* A person is recognized by first name, last name and mobile number. An employee of an  
organization is recognized by employee ID, designation and salary. A student of a college  
is recognized by USN, department and division. Employee is-a person, Student is-a 
person. Using this information, write a Java program that displays all the information of  
person, employee and student. Also draw the class diagram for the above scenario.*/

//      CLASS DIAGRAM
//           Person
//  -------------------------
//  | firstName             |
//  | lastName              |
//  | mobileNumber          |
//  -------------------------
//  | displayPerson()       |
//  -------------------------
//         /        \
//        /          \
//   Employee       Student

// Employee                      Student
// ---------------------        ---------------------
// | empId            |        | usn               |
// | designation      |        | department        |
// | salary           |        | division          |
// ---------------------        ---------------------
// | displayEmployee() |        | displayStudent() |
// ---------------------        ---------------------


import java.util.Scanner;

class Person {
    String firstName;
    String lastName;
    String mobileNumber;

    void getPersonDetails(Scanner sc) {
        System.out.print("Enter First Name: ");
        firstName = sc.next();

        System.out.print("Enter Last Name: ");
        lastName = sc.next();

        System.out.print("Enter Mobile Number: ");
        mobileNumber = sc.next();
    }

    void displayPerson() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Mobile Number: " + mobileNumber);
    }
}

class Employee extends Person {
    int empId;
    String designation;
    double salary;

    void getEmployeeDetails(Scanner sc) {
        System.out.print("Enter Employee ID: ");
        empId = sc.nextInt();

        System.out.print("Enter Designation: ");
        designation = sc.next();

        System.out.print("Enter Salary: ");
        salary = sc.nextDouble();
    }

    void displayEmployee() {
        displayPerson();
        System.out.println("Employee ID: " + empId);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }
}

class Student extends Person {
    String usn;
    String department;
    String division;

    void getStudentDetails(Scanner sc) {
        System.out.print("Enter USN: ");
        usn = sc.next();

        System.out.print("Enter Department: ");
        department = sc.next();

        System.out.print("Enter Division: ");
        division = sc.next();
    }

    void displayStudent() {
        displayPerson();
        System.out.println("USN: " + usn);
        System.out.println("Department: " + department);
        System.out.println("Division: " + division);
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter Employee Details");
        Employee e = new Employee();
        e.getPersonDetails(sc);
        e.getEmployeeDetails(sc);

        System.out.println("\nEnter Student Details");
        Student s = new Student();
        s.getPersonDetails(sc);
        s.getStudentDetails(sc);

        System.out.println("\nEmployee Information");
        e.displayEmployee();

        System.out.println("\nStudent Information");
        s.displayStudent();

        sc.close();
    }
}
