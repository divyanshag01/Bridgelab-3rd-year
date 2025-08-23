import java.util.Scanner;

/**
 * L2 Q03: Multiplication table from 6 to 9 for a given number.
 */
public class Q03_Table6to9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
        input.close();
    }
}
