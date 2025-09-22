
// Question_9: Program to generate calendar for given month and year
import java.util.Scanner;
import java.time.YearMonth;
public class Question_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        YearMonth ym = YearMonth.of(year, month);
        int days = ym.lengthOfMonth();
        System.out.println("Calendar for " + ym.getMonth() + " " + year);
        for (int d = 1; d <= days; d++) {
            System.out.print(d + " ");
            if (d % 7 == 0) System.out.println();
        }
        sc.close();
    }
}
