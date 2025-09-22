
// Question_3: Program to find the first non-repeating character in a string
import java.util.Scanner;
public class Question_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        char result = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (str.indexOf(c) == str.lastIndexOf(c)) {
                result = c;
                break;
            }
        }
        if (result != 0)
            System.out.println("First non-repeating character: " + result);
        else
            System.out.println("No non-repeating character found.");
        sc.close();
    }
}
