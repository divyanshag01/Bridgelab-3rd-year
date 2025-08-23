import java.util.Scanner;

/**
 * L2 Q04: FizzBuzz using for loop (1..n).
 */
public class Q04_FizzBuzzFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n < 1) {
            System.out.println("Enter a positive integer");
            input.close();
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) System.out.println("FizzBuzz");
            else if (i % 3 == 0) System.out.println("Fizz");
            else if (i % 5 == 0) System.out.println("Buzz");
            else System.out.println(i);
        }
        input.close();
    }
}
