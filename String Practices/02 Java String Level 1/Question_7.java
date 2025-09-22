import java.util.Scanner;

public class Question_7 {
    public static void generateException(String text) {
        int num = Integer.parseInt(text); // NumberFormatException
        System.out.println(num);
    }

    public static void handleException(String text) {
        try {
            int num = Integer.parseInt(text);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();

        // Uncomment below to see abrupt stop
        // generateException(text);
        handleException(text);
    }
}