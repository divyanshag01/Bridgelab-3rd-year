import java.util.Scanner;

/**
 * Q06: Check whether a number is positive, negative, or zero.
 */
public class Q06_PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
        input.close();
    }
}
