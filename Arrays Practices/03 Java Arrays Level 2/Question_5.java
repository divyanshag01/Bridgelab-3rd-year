import java.util.Scanner;
class Question_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num, count = 0;
        while (temp != 0) {
            count++;
            temp /= 10;
        }
        int[] digits = new int[count];
        temp = num;
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        for (int i = count - 1; i >= 0; i--) System.out.print(digits[i]);
    }
}