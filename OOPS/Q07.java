
class Box {
    double width;
    double height;
    double depth;

    // default constructor
    Box() {
        width = height = depth = 0;
    }

    // constructor with dimensions
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // cube constructor
    Box(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}

class BoxWeight extends Box {
    double weight;

    BoxWeight() {
        super();
        weight = 0;
    }

    BoxWeight(double w, double h, double d, double wt) {
        super(w, h, d);
        weight = wt;
    }

    BoxWeight(double len, double wt) {
        super(len);
        weight = wt;
    }
}

class Shipment extends BoxWeight {
    double cost;

    Shipment() {
        super();
        cost = 0;
    }

    Shipment(double w, double h, double d, double wt, double c) {
        super(w, h, d, wt);
        cost = c;
    }

    Shipment(double len, double wt, double c) {
        super(len, wt);
        cost = c;
    }
}

public class Main {
    public static void main(String[] args) {

        Shipment s1 = new Shipment(10, 5, 2, 3.5, 100);

        System.out.println("Width: " + s1.width);
        System.out.println("Height: " + s1.height);
        System.out.println("Depth: " + s1.depth);
        System.out.println("Weight: " + s1.weight);
        System.out.println("Cost: " + s1.cost);
        System.out.println("Volume: " + s1.volume());
    }
}
