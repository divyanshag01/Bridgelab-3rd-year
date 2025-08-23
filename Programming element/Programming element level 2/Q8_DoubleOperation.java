import java.util.Scanner;

class Q8_DoubleOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter double a: ");
        double a = input.nextDouble();
        System.out.print("Enter double b: ");
        double b = input.nextDouble();
        System.out.print("Enter double c: ");
        double c = input.nextDouble();

        // Operations with operator precedence
        double expr1 = a + b * c;
        double expr2 = a * b + c;
        String expr3Str;
        if (b == 0.0) {
            expr3Str = "undefined (division by zero)";
        } else {
            double expr3 = c + a / b;
            expr3Str = String.valueOf(expr3);
        }
        String expr4Str;
        if (b == 0.0) {
            expr4Str = "undefined (mod by zero)";
        } else {
            double expr4 = a % b + c;
            expr4Str = String.valueOf(expr4);
        }

        System.out.println("The results of Double Operations are " + expr1 + ", " + expr2 + ", " + expr3Str + ", and " + expr4Str);
        input.close();
    }
}