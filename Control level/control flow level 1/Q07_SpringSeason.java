/**
 * Q07: SpringSeason using command line args.
 * Spring is from March 20 to June 20 inclusive.
 * args[0] = month (1..12), args[1] = day (1..31)
 */
public class Q07_SpringSeason {
    public static void main(String[] args) {
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);
        boolean isSpring = false;
        // March
        if (month == 3 && day >= 20 && day <= 31) isSpring = true;
        // April, May
        if (month == 4 || month == 5) isSpring = true;
        // June
        if (month == 6 && day <= 20 && day >= 1) isSpring = true;
        System.out.println(isSpring ? "Its a Spring Season" : "Not a Spring Season");
    }
}
