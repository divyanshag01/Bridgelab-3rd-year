import java.util.Scanner;

/**
 * Q15: Factorial using for loop.
 */
public class Q15_FactorialFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n < 0) {
            System.out.println("Enter a non-negative integer");
            input.close();
            return;
        }
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println(fact);
        input.close();
    }
}
