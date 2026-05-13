// File 1 : AccessDemo.java
package pack1;

public class AccessDemo {

    private int privateVar = 10;
    int defaultVar = 20;          // default access
    protected int protectedVar = 30;
    public int publicVar = 40;

    public void display() {

        System.out.println("Inside Same Class");
        System.out.println("Private Variable: " + privateVar);
        System.out.println("Default Variable: " + defaultVar);
        System.out.println("Protected Variable: " + protectedVar);
        System.out.println("Public Variable: " + publicVar);
    }
}

// File 2 : SamePackageSubclass.java
package pack1;

public class SamePackageSubclass extends AccessDemo {

    public void show() {

        System.out.println("\nSame Package Subclass");

        // privateVar cannot be accessed

        System.out.println("Default Variable: " + defaultVar);
        System.out.println("Protected Variable: " + protectedVar);
        System.out.println("Public Variable: " + publicVar);
    }
}

// File 3 : SamePackageNonSubclass.java
package pack1;

public class SamePackageNonSubclass {

    public void show() {

        AccessDemo obj = new AccessDemo();

        System.out.println("\nSame Package Non-Subclass");

        // privateVar cannot be accessed

        System.out.println("Default Variable: " + obj.defaultVar);
        System.out.println("Protected Variable: " + obj.protectedVar);
        System.out.println("Public Variable: " + obj.publicVar);
    }
}


// File 4 : DifferentPackageSubclass.java
package pack2;

import pack1.AccessDemo;

public class DifferentPackageSubclass extends AccessDemo {

    public void show() {

        System.out.println("\nDifferent Package Subclass");

        // privateVar cannot be accessed
        // defaultVar cannot be accessed

        System.out.println("Protected Variable: " + protectedVar);
        System.out.println("Public Variable: " + publicVar);
    }
}

// File 5 : DifferentPackageNonSubclass.java
package pack2;

import pack1.AccessDemo;

public class DifferentPackageNonSubclass {

    public void show() {

        AccessDemo obj = new AccessDemo();

        System.out.println("\nDifferent Package Non-Subclass");

        // privateVar cannot be accessed
        // defaultVar cannot be accessed
        // protectedVar cannot be accessed

        System.out.println("Public Variable: " + obj.publicVar);
    }
}

// File 6 : Main.java
package pack1;

import pack2.DifferentPackageSubclass;
import pack2.DifferentPackageNonSubclass;

public class Main {

    public static void main(String[] args) {

        AccessDemo obj = new AccessDemo();
        obj.display();

        SamePackageSubclass s1 = new SamePackageSubclass();
        s1.show();

        SamePackageNonSubclass s2 = new SamePackageNonSubclass();
        s2.show();

        DifferentPackageSubclass d1 = new DifferentPackageSubclass();
        d1.show();

        DifferentPackageNonSubclass d2 = new DifferentPackageNonSubclass();
        d2.show();
    }
}
