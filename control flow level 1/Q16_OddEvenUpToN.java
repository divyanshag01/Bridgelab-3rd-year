import java.util.Scanner;

/**
 * Q16: Print odd/even for numbers 1..n.
 */
public class Q16_OddEvenUpToN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number < 1) {
            System.out.println("Not a Natural Number");
            input.close();
            return;
        }
        for (int i = 1; i <= number; i++) {
            System.out.println(i + (i % 2 == 0 ? " even" : " odd"));
        }
        input.close();
    }
}
