
// Question_2: Program to find unique characters in a string
import java.util.Scanner;
public class Question_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String unique = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (unique.indexOf(c) == -1) {
                unique += c;
            }
        }
        System.out.println("Unique characters: " + unique);
        sc.close();
    }
}
