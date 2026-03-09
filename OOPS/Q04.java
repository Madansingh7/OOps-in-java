//Grade calculator
import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {

            System.out.println("\nStudent " + i);

            System.out.print("Enter IA1 marks: ");
            int ia1 = sc.nextInt();

            System.out.print("Enter IA2 marks: ");
            int ia2 = sc.nextInt();

            System.out.print("Enter IA3 marks: ");
            int ia3 = sc.nextInt();

            System.out.print("Enter CTA marks (out of 10): ");
            int cta = sc.nextInt();

            System.out.print("Enter SEE marks: ");
            int see = sc.nextInt();

            // Best of 2 IA
            int best1 = Math.max(ia1, ia2);
            int best2 = Math.max(Math.min(ia1, ia2), ia3);
            int bestOf2 = best1 + best2;

            // CIE calculation
            int cie = bestOf2 + cta;

            // SEE 50%
            double seeContribution = see * 0.5;

            // Final marks
            double finalMarks = cie + seeContribution;

            String grade;

            if(finalMarks >= 90)
                grade = "O";
            else if(finalMarks >= 80)
                grade = "A+";
            else if(finalMarks >= 70)
                grade = "A";
            else if(finalMarks >= 60)
                grade = "B+";
            else if(finalMarks >= 50)
                grade = "B";
            else if(finalMarks >= 45)
                grade = "C";
            else if(finalMarks >= 40)
                grade = "P";
            else
                grade = "F";

            System.out.println("CIE Marks: " + cie);
            System.out.println("Final Marks: " + finalMarks);
            System.out.println("Grade: " + grade);
        }

        sc.close();
    }
}
