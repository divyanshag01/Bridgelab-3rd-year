import java.util.Scanner;

/**
 * L3 Q03: Input marks for physics, chemistry, maths; compute percentage and grade.
 * Note: Grade scale assumed (table not provided):
 * >=90 A+ (Excellent), >=80 A (Very Good), >=70 B (Good),
 * >=60 C (Satisfactory), >=50 D (Pass), else F (Fail).
 */
public class Q03_PercentageAndGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double physics = input.nextDouble();
        double chemistry = input.nextDouble();
        double maths = input.nextDouble();
        double total = physics + chemistry + maths;
        double percentage = total / 3.0;

        String grade, remark;
        if (percentage >= 90) { grade = "A+"; remark = "Excellent"; }
        else if (percentage >= 80) { grade = "A"; remark = "Very Good"; }
        else if (percentage >= 70) { grade = "B"; remark = "Good"; }
        else if (percentage >= 60) { grade = "C"; remark = "Satisfactory"; }
        else if (percentage >= 50) { grade = "D"; remark = "Pass"; }
        else { grade = "F"; remark = "Fail"; }

        System.out.printf("Average: %.2f%%, Grade: %s, Remarks: %s%n", percentage, grade, remark);
        input.close();
    }
}
