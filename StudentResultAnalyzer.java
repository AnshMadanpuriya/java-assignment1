import java.util.Scanner;

public class StudentResultAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        int[] marks = new int[n];
        int sum = 0;
        boolean failed = false;

        System.out.println("Enter marks: ");
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
            if (marks[i] < 33) {
                failed = true;
            }
            sum += marks[i];
        }

        if (failed) {
            System.out.println("Fail");
        } else {
            double average = sum / (double) n;
            if (average >= 75) {
                System.out.println("Distinction");
            } else if (average >= 60) {
                System.out.println("First Class");
            } else if (average >= 50) {
                System.out.println("Second Class");
            } else {
                System.out.println("Pass");
            }
        }

        sc.close();
    }
}