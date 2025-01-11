// Box class with instance variables and method for volume
class Box {
    double length, breadth, height;

    // Constructor to initialize Box dimensions
    Box(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    // Method to calculate volume
    double getVolume() {
        return length * breadth * height;
    }
}

// BoxWeight subclass that extends Box and adds weight
class BoxWeight extends Box {
    double weight;

    // Constructor to initialize Box dimensions and weight
    BoxWeight(double length, double breadth, double height, double weight) {
        super(length, breadth, height); // Call to superclass constructor
        this.weight = weight;
    }

    // Method to display weight
    void displayWeight() {
        System.out.println("Weight: " + weight);
    }
}

// Main class to demonstrate BoxWeight
public class BoxDemo {
    public static void main(String[] args) {
        // Creating two BoxWeight objects
        BoxWeight box1 = new BoxWeight(10, 5, 4, 15);
        BoxWeight box2 = new BoxWeight(8, 6, 3, 10);

        // Displaying volumes and weights of both boxes
        System.out.println("Box 1 Volume: " + box1.getVolume());
        box1.displayWeight();

        System.out.println("Box 2 Volume: " + box2.getVolume());
        box2.displayWeight();
    }
}
