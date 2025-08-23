import java.util.Scanner;

class Q6_QuotientAndRemainder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int number1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int number2 = input.nextInt();

        if (number2 == 0) {
            System.out.println("The Quotient is undefined and Reminder is undefined of two number " + number1 + " and " + number2 + " (division by zero).");
        } else {
            int quotient = number1 / number2;
            int remainder = number1 % number2;
            System.out.println("The Quotient is " + quotient + " and Reminder is " + remainder +
                    " of two number " + number1 + " and " + number2);
        }
        input.close();
    }
}