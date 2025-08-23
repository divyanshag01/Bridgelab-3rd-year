import java.util.Scanner;

/**
 * Q17: 5% bonus if years of service > 5.
 */
public class Q17_BonusOnServiceYears {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salary = input.nextDouble();
        int years = input.nextInt();
        double bonus = (years > 5) ? (0.05 * salary) : 0.0;
        System.out.println(bonus);
        input.close();
    }
}
