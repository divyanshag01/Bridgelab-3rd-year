import java.util.Scanner;

/**
 * Q02: Check if the first is the smallest among three numbers.
 */
public class Q02_FirstIsSmallestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        boolean firstIsSmallest = (number1 <= number2) && (number1 <= number3);
        System.out.println("Is the first number the smallest? " + firstIsSmallest);
        input.close();
    }
}
