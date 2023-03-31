package ch04.fig4_8;

import java.util.Scanner;

public class ClassAverage2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

         int total = 0;
         int gradeCounter = 0;

        System.out.println("Enter grade or -1 to quit ");
        int grade = input.nextInt();

        while (grade != -1) {
            total += grade;
            gradeCounter += 1;

            System.out.println("Enter grade or -1 to quit ");
            grade = input.nextInt();
        }
        if (gradeCounter != 0) {
            double average = (double) total / gradeCounter;

            System.out.printf("%nThe total grades of %d students is: %d", gradeCounter, total);
            System.out.printf("%nThe average grade of %d students is: %.2f", gradeCounter, average);
        }
        else {
            System.out.println("No grades were entered");
        }
    }
}

/**
 * Initialize total to zero
 * Initialize counter to zero
 * Prompt the user to enter the first grade
 * Input the first grade (possibly the sentinel)
 * While the user has not yet entered the sentinel
 * Add this grade into the running total
 * Add one to the grade counter
 * Prompt the user to enter the next grade
 * Input the next grade (possibly the sentinel)
 * If the counter is not equal to zero
 * Set the average to the total divided by the counter
 * Print the average
 * Else
 * Print “No grades were entered”
 */
