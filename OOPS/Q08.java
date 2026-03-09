/* Using the concept of abstract class, write a Java program that calculates the area and  
perimeters of circle, triangle, square and rectangle. */

//           Shape (abstract)
//                  |
// -------------------------------------
// |          |          |               |
// Circle   Triangle    Square       Rectangle

import java.util.Scanner;

abstract class Shape {
    abstract void area();
    abstract void perimeter();
}

class Circle extends Shape {
    double r;

    Circle(double r) {
        this.r = r;
    }

    void area() {
        System.out.println("Area of Circle: " + (3.14 * r * r));
    }

    void perimeter() {
        System.out.println("Perimeter of Circle: " + (2 * 3.14 * r));
    }
}

class Rectangle extends Shape {
    double l, b;

    Rectangle(double l, double b) {
        this.l = l;
        this.b = b;
    }

    void area() {
        System.out.println("Area of Rectangle: " + (l * b));
    }

    void perimeter() {
        System.out.println("Perimeter of Rectangle: " + (2 * (l + b)));
    }
}

class Square extends Shape {
    double s;

    Square(double s) {
        this.s = s;
    }

    void area() {
        System.out.println("Area of Square: " + (s * s));
    }

    void perimeter() {
        System.out.println("Perimeter of Square: " + (4 * s));
    }
}

class Triangle extends Shape {
    double a, b, c;

    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void area() {
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Area of Triangle: " + area);
    }

    void perimeter() {
        System.out.println("Perimeter of Triangle: " + (a + b + c));
    }
}

public class Main {
    public static void main(String[] args) {

        Circle c = new Circle(5);
        c.area();
        c.perimeter();

        Rectangle r = new Rectangle(4, 6);
        r.area();
        r.perimeter();

        Square s = new Square(4);
        s.area();
        s.perimeter();

        Triangle t = new Triangle(3, 4, 5);
        t.area();
        t.perimeter();
    }
}
