import java.util.Scanner;

/**
 * Q11: Sum until the user enters 0 or a negative number (while + break).
 */
public class Q11_SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0.0;
        while (true) {
            double val = input.nextDouble();
            if (val <= 0.0) break;
            total += val;
        }
        System.out.println(total);
        input.close();
    }
}
