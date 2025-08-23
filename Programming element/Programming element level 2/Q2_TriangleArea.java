import java.util.Scanner;

class Q2_TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Inputs in centimeters
        System.out.print("Enter base (in cm): ");
        double base = input.nextDouble();
        System.out.print("Enter height (in cm): ");
        double height = input.nextDouble();

        // Area in square centimeters
        double areaSqCm = 0.5 * base * height;

        // Convert to square inches (1 in = 2.54 cm, so 1 sq in = 2.54^2 sq cm)
        double cmPerIn = 2.54;
        double areaSqIn = areaSqCm / (cmPerIn * cmPerIn);

        // Output
        System.out.println("The Area of the triangle in sq in is " + areaSqIn + " and sq cm is " + areaSqCm);
        input.close();
    }
}