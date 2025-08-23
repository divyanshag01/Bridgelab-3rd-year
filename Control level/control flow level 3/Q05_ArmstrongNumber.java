import java.util.Scanner;

/**
 * L3 Q05: Check if a number is an Armstrong number (sum of cubes of digits equals the number).
 */
public class Q05_ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int original = number;
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            sum += digit * digit * digit;
            number /= 10;
        }
        System.out.println(sum == original ? "Armstrong Number" : "Not an Armstrong Number");
        input.close();
    }
}
