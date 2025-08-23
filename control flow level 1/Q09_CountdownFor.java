import java.util.Scanner;

/**
 * Q09: Countdown using for loop from user input to 1.
 */
public class Q09_CountdownFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }
        input.close();
    }
}
