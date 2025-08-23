import java.util.Scanner;

/**
 * L2 Q09: Greatest factor of a number (besides itself) using for loop.
 */
public class Q09_GreatestProperFactorFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number <= 1) {
            System.out.println(1);
            input.close();
            return;
        }
        int greatestFactor = 1;
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
        }
        System.out.println(greatestFactor);
        input.close();
    }
}
