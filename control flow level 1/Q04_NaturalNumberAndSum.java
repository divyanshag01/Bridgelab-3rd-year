import java.util.Scanner;

/**
 * Q04: Check natural number and print sum of n natural numbers.
 */
public class Q04_NaturalNumberAndSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        if (n >= 0) {
            long sum = n * (n + 1) / 2;
            System.out.println("The sum of " + n + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + n + " is not a natural number");
        }
        input.close();
    }
}
