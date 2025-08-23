import java.util.Scanner;

/**
 * Q13: Sum of n natural numbers using for and compare with formula.
 */
public class Q13_SumNaturalNumbersForVsFormula {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        if (n < 0) {
            System.out.println("Not a Natural number");
            input.close();
            return;
        }
        long sumFormula = n * (n + 1) / 2;
        long sumLoop = 0;
        for (long i = 1; i <= n; i++) {
            sumLoop += i;
        }
        System.out.println("Formula: " + sumFormula);
        System.out.println("For loop: " + sumLoop);
        System.out.println("Match: " + (sumFormula == sumLoop));
        input.close();
    }
}
