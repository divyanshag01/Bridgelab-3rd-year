import java.util.Scanner;

/**
 * L2 Q12: Power using for loop (number^power, power >= 0).
 */
public class Q12_PowerFor {
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
        for (long i = 1; i <= power; i++) {
            result *= number;
        }
        System.out.println(result);
        input.close();
    }
}
