
// Question_1: Program to calculate BMI for 10 persons
import java.util.Scanner;
public class Question_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] height = new double[10];
        double[] weight = new double[10];
        double[] bmi = new double[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter height (m) of person " + (i+1) + ": ");
            height[i] = sc.nextDouble();
            System.out.print("Enter weight (kg) of person " + (i+1) + ": ");
            weight[i] = sc.nextDouble();
            bmi[i] = weight[i] / (height[i] * height[i]);
        }
        System.out.println("Person\tHeight(m)\tWeight(kg)\tBMI");
        for (int i = 0; i < 10; i++) {
            System.out.println((i+1) + "\t" + height[i] + "\t" + weight[i] + "\t" + bmi[i]);
        }
        sc.close();
    }
}
