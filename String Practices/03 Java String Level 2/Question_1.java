import java.util.Scanner;

public class Question_1 {
    public static int customLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();

        int customLen = customLength(str);
        int builtInLen = str.length();

        System.out.println("Custom Length: " + customLen);
        System.out.println("Built-in Length: " + builtInLen);
    }
}