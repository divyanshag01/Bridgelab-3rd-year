import java.util.Scanner;

/**
 * Q01: Check if a number is divisible by 5.
 */
public class Q01_DivisibleBy5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        boolean divisible = (number % 5 == 0);
        System.out.println("Is the number " + number + " divisible by 5? " + divisible);
        input.close();
    }
}
