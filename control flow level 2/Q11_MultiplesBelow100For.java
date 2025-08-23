import java.util.Scanner;

/**
 * L2 Q11: Print all multiples of a number below 100 (using for loop).
 */
public class Q11_MultiplesBelow100For {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number <= 0) {
            System.out.println("Enter a positive integer less than 100");
            input.close();
            return;
        }
        for (int i = number; i < 100; i += number) {
            System.out.println(i);
        }
        input.close();
    }
}
