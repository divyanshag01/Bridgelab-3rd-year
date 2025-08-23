import java.util.Scanner;

/**
 * L2 Q02: 5% bonus if service > 5 years.
 */
public class Q02_BonusByYears {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salary = input.nextDouble();
        int years = input.nextInt();
        double bonus = (years > 5) ? salary * 0.05 : 0.0;
        System.out.println(bonus);
        input.close();
    }
}
