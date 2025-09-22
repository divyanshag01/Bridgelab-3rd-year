
// Question 2: Circle class with constructor chaining
class Circle {
    double radius;

    // Default constructor
    Circle() {
        this(1.0); // Constructor chaining
    }

    // Parameterized constructor
    Circle(double radius) {
        this.radius = radius;
    }

    void display() {
        System.out.println("Radius: " + radius);
    }
}
