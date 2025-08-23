import java.util.Scanner;

/**
 * Q12: Sum of n natural numbers using while and compare with formula.
 */
public class Q12_SumNaturalNumbersWhileVsFormula {
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
        long counter = 1;
        while (counter <= n) {
            sumLoop += counter;
            counter++;
        }
        System.out.println("Formula: " + sumFormula);
        System.out.println("While loop: " + sumLoop);
        System.out.println("Match: " + (sumFormula == sumLoop));
        input.close();
    }
}
