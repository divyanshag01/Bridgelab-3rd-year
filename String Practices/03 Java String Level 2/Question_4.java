import java.util.Scanner;

public class Question_4 {
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

    public static String[][] wordWithLength(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(customLength(words[i]));
        }
        return result;
    }

    public static int[] findMinMax(String[][] wordTable) {
        int minIdx = 0, maxIdx = 0;
        for (int i = 1; i < wordTable.length; i++) {
            if (Integer.parseInt(wordTable[i][1]) < Integer.parseInt(wordTable[minIdx][1])) {
                minIdx = i;
            }
            if (Integer.parseInt(wordTable[i][1]) > Integer.parseInt(wordTable[maxIdx][1])) {
                maxIdx = i;
            }
        }
        return new int[]{minIdx, maxIdx};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String[] words = customSplit(text);
        String[][] table = wordWithLength(words);
        int[] minMax = findMinMax(table);

        System.out.println("Shortest Word: " + table[minMax[0]][0]);
        System.out.println("Longest Word: " + table[minMax[1]][0]);
    }
}