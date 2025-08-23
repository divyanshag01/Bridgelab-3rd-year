import java.util.Scanner;

/**
 * Q10: Sum numbers until the user enters 0.
 */
public class Q10_SumUntilZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0.0;
        while (true) {
            double val = input.nextDouble();
            if (val == 0.0) break;
            total += val;
        }
        System.out.println(total);
        input.close();
    }
}
