
// Question_7: Program to check if a string is palindrome using 3 logics
import java.util.Scanner;
public class Question_7 {
    static boolean isPalindrome1(String s) {
        String rev = new StringBuilder(s).reverse().toString();
        return s.equals(rev);
    }
    static boolean isPalindrome2(String s) {
        for (int i = 0; i < s.length()/2; i++) {
            if (s.charAt(i) != s.charAt(s.length()-1-i)) return false;
        }
        return true;
    }
    static boolean isPalindrome3(String s) {
        int left = 0, right = s.length()-1;
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Logic 1: " + isPalindrome1(str));
        System.out.println("Logic 2: " + isPalindrome2(str));
        System.out.println("Logic 3: " + isPalindrome3(str));
        sc.close();
    }
}
