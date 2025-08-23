import java.util.Scanner;

class Q7_IntOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter integer a: ");
        int a = input.nextInt();
        System.out.print("Enter integer b: ");
        int b = input.nextInt();
        System.out.print("Enter integer c: ");
        int c = input.nextInt();

        // Operations with operator precedence
        // a + b * c
        int expr1 = a + b * c;
        // a * b + c
        int expr2 = a * b + c;
        // c + a / b   (handle division by zero)
        String expr3Str;
        if (b == 0) {
            expr3Str = "undefined (division by zero)";
        } else {
            int expr3 = c + a / b;
            expr3Str = String.valueOf(expr3);
        }
        // a % b + c   (handle modulus by zero)
        String expr4Str;
        if (b == 0) {
            expr4Str = "undefined (mod by zero)";
        } else {
            int expr4 = a % b + c;
            expr4Str = String.valueOf(expr4);
        }

        System.out.println("The results of Int Operations are " + expr1 + ", " + expr2 + ", " + expr3Str + ", and " + expr4Str);
        input.close();
    }
}