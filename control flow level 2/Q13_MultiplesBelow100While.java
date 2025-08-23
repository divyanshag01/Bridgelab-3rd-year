import java.util.Scanner;

/**
 * L2 Q13: Print all multiples of a number below 100 (using while loop).
 */
public class Q13_MultiplesBelow100While {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number <= 0) {
            System.out.println("Enter a positive integer less than 100");
            input.close();
            return;
        }
        int multiple = number;
        while (multiple < 100) {
            System.out.println(multiple);
            multiple += number;
        }
        input.close();
    }
}
