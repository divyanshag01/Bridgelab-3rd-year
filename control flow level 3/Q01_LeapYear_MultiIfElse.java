import java.util.Scanner;

/**
 * L3 Q01: Leap Year using multiple if/else.
 * Valid only for year >= 1582 (Gregorian calendar).
 */
public class Q01_LeapYear_MultiIfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        if (year < 1582) {
            System.out.println("Enter year >= 1582");
            input.close();
            return;
        }
        if (year % 400 == 0) {
            System.out.println("Leap Year");
        } else if (year % 100 == 0) {
            System.out.println("Not a Leap Year");
        } else if (year % 4 == 0) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }
        input.close();
    }
}
