import java.util.Scanner;

public class Question_7 {
    public static int[] trimIndexes(String str) {
        int start = 0, end = str.length() - 1;
        while (start <= end && str.charAt(start) == ' ') start++;
        while (end >= start && str.charAt(end) == ' ') end--;
        return new int[]{start, end + 1};
    }

    public static String substringCustom(String str, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += str.charAt(i);
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
        System.out.print("Enter a string with spaces: ");
        String str = sc.nextLine();

        int[] indexes = trimIndexes(str);
        String customTrim = substringCustom(str, indexes[0], indexes[1]);
        String builtInTrim = str.trim();

        System.out.println("Custom Trimmed: '" + customTrim + "'");
        System.out.println("Built-in Trimmed: '" + builtInTrim + "'");
        System.out.println("Are equal? " + compareStrings(customTrim, builtInTrim));
    }
}