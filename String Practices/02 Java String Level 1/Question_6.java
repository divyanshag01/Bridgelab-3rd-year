import java.util.Scanner;

public class Question_6 {
    public static void generateException(String str) {
        System.out.println(str.substring(5, 2)); // IllegalArgumentException
    }

    public static void handleException(String str) {
        try {
            System.out.println(str.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();

        // Uncomment below to see abrupt stop
        // generateException(str);
        handleException(str);
    }
}