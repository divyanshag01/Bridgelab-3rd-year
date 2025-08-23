import java.util.Scanner;

/**
 * L3 Q08: Check if a number is a Harshad (Niven) Number.
 */
public class Q08_HarshadNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int n = Math.abs(number);
        int sum = 0;
        int temp = n;
        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }
        boolean isHarshad = (sum != 0) && (n % sum == 0);
        System.out.println(isHarshad ? "Harshad Number" : "Not a Harshad Number");
        input.close();
    }
}
