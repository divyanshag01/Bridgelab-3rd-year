import java.util.Scanner;

/**
 * Q14: Factorial using while loop.
 */
public class Q14_FactorialWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n < 0) {
            System.out.println("Enter a non-negative integer");
            input.close();
            return;
        }
        long fact = 1;
        int i = 1;
        while (i <= n) {
            fact *= i;
            i++;
        }
        System.out.println(fact);
        input.close();
    }
}
