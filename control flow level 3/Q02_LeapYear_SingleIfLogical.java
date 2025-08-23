import java.util.Scanner;

/**
 * L3 Q02: Leap Year using single if with logical operators.
 * Valid only for year >= 1582.
 */
public class Q02_LeapYear_SingleIfLogical {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        if (year < 1582) {
            System.out.println("Enter year >= 1582");
            input.close();
            return;
        }
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }
        input.close();
    }
}
