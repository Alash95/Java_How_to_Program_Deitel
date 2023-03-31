package ch04.fig4_8;

import java.util.Scanner;

public class StudentAverage {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0;
        int gradeCounter = 1;

        while (gradeCounter <= 10) {
            System.out.println("Enter the next grade: ");
            int grade = input.nextInt();

            total += grade;
            gradeCounter += 1;
        }

        int average = total / 10;

        System.out.printf("%nThe total of 10 students is: %d%n", total);
        System.out.printf("The average of 10 students is: %d", average);
    }
}

/**
 * Set total to zero
 * Set grade counter to one
 * While grade counter is less than or equal to ten
 * Prompt the user to enter the next grade
 * Input the next grade
 * Add the grade into the total
 * Add one to the grade counter
 * Set the class average to the total divided by ten
 * Print the class average
 */
