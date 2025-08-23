import java.util.Scanner;

/**
 * L3 Q06: Count number of digits in an integer.
 */
public class Q06_CountDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long number = input.nextLong();
        if (number == 0) {
            System.out.println(1);
            input.close();
            return;
        }
        long n = Math.abs(number);
        int count = 0;
        while (n != 0) {
            n /= 10;
            count++;
        }
        System.out.println(count);
        input.close();
    }
}
