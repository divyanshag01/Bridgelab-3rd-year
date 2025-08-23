import java.util.Scanner;

/**
 * L2 Q01: Print odd/even for 1..n (natural number check).
 */
public class Q01_OddEvenUpToN {
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
