import java.util.Scanner;

/**
 * Q18: Multiplication table of a number from 6 to 9.
 */
public class Q18_TableFrom6To9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
        input.close();
    }
}
