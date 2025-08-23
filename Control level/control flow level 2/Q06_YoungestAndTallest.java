import java.util.Scanner;

/**
 * L2 Q06: Youngest among three by age, tallest by height.
 */
public class Q06_YoungestAndTallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Ages
        int ageAmar = input.nextInt();
        int ageAkbar = input.nextInt();
        int ageAnthony = input.nextInt();
        // Heights
        double htAmar = input.nextDouble();
        double htAkbar = input.nextDouble();
        double htAnthony = input.nextDouble();

        String youngest;
        if (ageAmar <= ageAkbar && ageAmar <= ageAnthony) youngest = "Amar";
        else if (ageAkbar <= ageAmar && ageAkbar <= ageAnthony) youngest = "Akbar";
        else youngest = "Anthony";

        String tallest;
        if (htAmar >= htAkbar && htAmar >= htAnthony) tallest = "Amar";
        else if (htAkbar >= htAmar && htAkbar >= htAnthony) tallest = "Akbar";
        else tallest = "Anthony";

        System.out.println("Youngest: " + youngest);
        System.out.println("Tallest: " + tallest);
        input.close();
    }
}
