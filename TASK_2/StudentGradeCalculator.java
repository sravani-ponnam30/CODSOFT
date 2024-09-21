import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Enter marks for the 1st subject out of 100: ");
        int marksSubject1 = inputScanner.nextInt();
        
        System.out.println("Enter marks for the 2nd subject out of 100: ");
        int marksSubject2 = inputScanner.nextInt();
        
        System.out.println("Enter marks for the 3rd subject out of 100: ");
        int marksSubject3 = inputScanner.nextInt();
        
        System.out.println("Enter marks for the 4th subject out of 100: ");
        int marksSubject4 = inputScanner.nextInt();
        
        System.out.println("Enter marks for the 5th subject out of 100: ");
        int marksSubject5 = inputScanner.nextInt();

        int totalMarks = marksSubject1 + marksSubject2 + marksSubject3 + marksSubject4 + marksSubject5;

        double averagePercentage = totalMarks / 5.0;

        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        inputScanner.close();
    }
}
