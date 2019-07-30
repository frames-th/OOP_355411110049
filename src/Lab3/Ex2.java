package Lab3;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        double testScore;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your numeric test score and I will tell you the grade : ");
            testScore = sc.nextDouble();
            if (testScore >= 0 && testScore <= 49.99)
                System.out.println("Your grade is F. ");
            else if (testScore >= 50 && testScore <= 54.99)
                System.out.println("Your grade is D. ");
            else if (testScore >= 55 && testScore <= 59.99)
                System.out.println("Your grade is D+. ");
            else if (testScore >= 60 && testScore <= 64.99)
                System.out.println("Your grade is C. ");
            else if (testScore >= 65 && testScore <= 69.99)
                System.out.println("Your grade is C+. ");
            else if (testScore >= 70 && testScore <= 74.99)
                System.out.println("Your grade is B. ");
            else if (testScore >= 75 && testScore <= 79.99)
                System.out.println("Your grade is B+. ");
            else if (testScore >= 80 && testScore <= 100)
                System.out.println("Your grade is A. ");
            else
                System.out.println("Invalid score. ");
    }
}
