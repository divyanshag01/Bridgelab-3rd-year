/**
 * L3 Q11: DayOfWeek using Zeller-like formula for Gregorian calendar.
 * Command-line args: m (1..12), d (1..31), y (>=1582)
 * Output: 0=Sunday, 1=Monday, ..., 6=Saturday
 */
public class Q11_DayOfWeek {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);
        // Zeller's congruence (adjust months: March=3,..., January=13, February=14 of previous year)
        int mm = m;
        int yy = y;
        if (m < 3) {
            mm = m + 12;
            yy = y - 1;
        }
        int k = yy % 100;
        int j = yy / 100;
        int h = (d + (13 * (mm + 1)) / 5 + k + (k / 4) + (j / 4) + 5 * j) % 7;
        // Zeller: 0=Saturday, 1=Sunday, ..., 6=Friday
        int zeller = h;
        int dayOfWeek = (zeller + 6) % 7; // convert to 0=Sunday ... 6=Saturday
        System.out.println(dayOfWeek);
    }
}
