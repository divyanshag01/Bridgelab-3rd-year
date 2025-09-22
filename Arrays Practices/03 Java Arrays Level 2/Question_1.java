import java.util.Scanner;
class Question_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] years = new int[10];
        double[] salary = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];
        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;
        for (int i = 0; i < 10; i++) {
            int y = sc.nextInt();
            double s = sc.nextDouble();
            if (y < 0 || s < 0) {
                i--;
                continue;
            }
            years[i] = y;
            salary[i] = s;
            if (y > 5) bonus[i] = 0.05 * s;
            else bonus[i] = 0.02 * s;
            newSalary[i] = s + bonus[i];
            totalBonus += bonus[i];
            totalOldSalary += s;
            totalNewSalary += newSalary[i];
        }
        System.out.println(totalBonus);
        System.out.println(totalOldSalary);
        System.out.println(totalNewSalary);
    }
}