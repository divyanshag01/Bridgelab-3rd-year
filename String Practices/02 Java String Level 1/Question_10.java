import java.util.Scanner;

public class Question_10 {
    public static String toLowerCaseCustom(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);
            }
            result += ch;
        }
        return result;
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String customLower = toLowerCaseCustom(str);
        String builtInLower = str.toLowerCase();

        System.out.println("Custom Lowercase: " + customLower);
        System.out.println("Built-in Lowercase: " + builtInLower);
        System.out.println("Comparison: " + compareStrings(customLower, builtInLower));
    }
}