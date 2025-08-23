import java.util.Scanner;

/**
 * L2 Q05: FizzBuzz using while loop (1..n).
 */
public class Q05_FizzBuzzWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n < 1) {
            System.out.println("Enter a positive integer");
            input.close();
            return;
        }
        int i = 1;
        while (i <= n) {
            if (i % 15 == 0) System.out.println("FizzBuzz");
            else if (i % 3 == 0) System.out.println("Fizz");
            else if (i % 5 == 0) System.out.println("Buzz");
            else System.out.println(i);
            i++;
        }
        input.close();
    }
}
