import java.util.Scanner;

/**
 * L2 Q14: Power using while loop (number^power, power >= 0).
 */
public class Q14_PowerWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long number = input.nextLong();
        long power = input.nextLong();
        if (power < 0) {
            System.out.println("Enter non-negative power");
            input.close();
            return;
        }
        long result = 1;
        long counter = 0;
        while (counter < power) {
            result *= number;
            counter++;
        }
        System.out.println(result);
        input.close();
    }
}
