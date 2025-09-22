import java.util.Scanner;

public class Question_5 {
    public static void generateException(String str) {
        System.out.println(str.charAt(str.length())); // StringIndexOutOfBoundsException
    }

    public static void handleException(String str) {
        try {
            System.out.println(str.charAt(str.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
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