import java.util.Scanner;

/**
 * L2 Q07: Print factors of a number using for loop.
 */
public class Q07_FactorsFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number <= 0) {
            System.out.println("Enter a positive integer");
            input.close();
            return;
        }
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) System.out.println(i);
        }
        input.close();
    }
}
