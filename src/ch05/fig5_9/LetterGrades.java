package ch05.fig5_9;

import java.util.Scanner;

public class LetterGrades {
    public static void main(String[] args) {

        int gradeCounter = 0;
        int total = 0;
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;
        int fCount = 0;

        Scanner input = new Scanner(System.in);

        System.out.printf("%s%n%s%n   %s%n   %s%n",
                "Enter the integer grades in the range 0-100.",
                "Type the end-of-file indicator to terminate input:",
                "On UNIX/Linux/macOS type <Ctrl> d then press Enter",
                "On Windows type <Ctrl> z then press Enter");



        while (true) {
                int grade = input.nextInt();
                if (grade <= 0) {
                    System.out.println("Exiting input loop");
                    break;
                }
                total += grade;
                gradeCounter++;

                switch (grade / 10) {
                    case 9, 10 -> aCount++;
                    case 8 -> bCount++;
                    case 7 -> cCount++;
                    case 6 -> dCount++;
                    default -> fCount++;

                }

        }
        System.out.printf("%nGrade Report:%n");

        if (gradeCounter != 0) {
            double average = (double) total / gradeCounter;

            System.out.printf("Total of the %d grades entered is %d%n",
                    gradeCounter, total);
            System.out.printf("Class average is %.2f%n", average);
            System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n",
                    "Number of students who received each grade:",
                    "A: ", aCount,
                    "B: ", bCount,
                    "C: ", cCount,
                    "D: ", dCount,
                    "F: ", fCount);
        }
        else {
            System.out.println("No grades were entered");
        }
        input.close();

    }
}
