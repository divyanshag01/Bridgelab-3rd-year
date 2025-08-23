import java.util.Scanner;

/**
 * L2 Q10: Greatest factor of a number (besides itself) using while loop.
 */
public class Q10_GreatestProperFactorWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number <= 1) {
            System.out.println(1);
            input.close();
            return;
        }
        int counter = number - 1;
        int greatestFactor = 1;
        while (counter >= 1) {
            if (number % counter == 0) {
                greatestFactor = counter;
                break;
            }
            counter--;
        }
        System.out.println(greatestFactor);
        input.close();
    }
}
