
import java.util.Scanner;

public class AppTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== GRADE CALCULATOR =====");

        System.out.print("Enter your marks: ");

        if (!sc.hasNextInt()) {
            System.out.println("Invalid Marks!");
            sc.close();
            return;
        }

        int marks = sc.nextInt();

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid Marks!");
        }
        else if (marks >= 90) {
            System.out.println("Grade: A+");
        }
        else if (marks >= 80) {
            System.out.println("Grade: A");
        }
        else if (marks >= 70) {
            System.out.println("Grade: B");
        }
        else if (marks >= 60) {
            System.out.println("Grade: C");
        }
        else if (marks >= 35) {
            System.out.println("Grade: D");
        }
        else {
            System.out.println("Grade: Fail");
        }

        sc.close();
    }
}
