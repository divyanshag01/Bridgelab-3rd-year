
// Question_5: Program to find frequency of characters using unique characters
import java.util.Scanner;
public class Question_5 {
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
        for (int i = 0; i < unique.length(); i++) {
            char c = unique.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == c) count++;
            }
            System.out.println(c + ": " + count);
        }
        sc.close();
    }
}
