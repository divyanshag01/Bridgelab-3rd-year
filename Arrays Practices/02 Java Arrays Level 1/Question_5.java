import java.util.Scanner;
class Question_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] table = new int[4];
        for(int i=6;i<=9;i++){
            System.out.println("Table of " + i);
            for(int j=1;j<=10;j++){
                System.out.println(i + " * " + j + " = " + (i*j));
            }
        }
    }
}