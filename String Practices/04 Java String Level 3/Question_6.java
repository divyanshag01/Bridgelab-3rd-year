
// Question_6: Program to find frequency of characters using nested loops
import java.util.Scanner;
public class Question_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        boolean[] visited = new boolean[str.length()];
        for (int i = 0; i < str.length(); i++) {
            if (visited[i]) continue;
            char c = str.charAt(i);
            int count = 1;
            for (int j = i+1; j < str.length(); j++) {
                if (str.charAt(j) == c) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(c + ": " + count);
        }
        sc.close();
    }
}
