import java.util.Scanner;

/**
 * Q08: Countdown using while loop from user input to 1.
 */
public class Q08_CountdownWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = input.nextInt();
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }
        input.close();
    }
}
