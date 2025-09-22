import java.util.Scanner;

public class Question_2 {
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

    public static String[] customSplit(String str) {
        int n = customLength(str);
        int spaceCount = 0;
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == ' ') spaceCount++;
        }
        String[] words = new String[spaceCount + 1];
        int start = 0, wordIndex = 0;
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == ' ') {
                words[wordIndex++] = str.substring(start, i);
                start = i + 1;
            }
        }
        words[wordIndex] = str.substring(start, n);
        return words;
    }

    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String[] customWords = customSplit(text);
        String[] builtInWords = text.split(" ");

        System.out.println("Comparison: " + compareArrays(customWords, builtInWords));
    }
}