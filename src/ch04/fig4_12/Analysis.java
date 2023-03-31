package ch04.fig4_12;

import java.util.Scanner;

public class Analysis {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int passes = 0;
        int failures = 0;
        int studentCounter = 1;

        while (studentCounter <= 10) {
            System.out.println("Enter result (1 = pass, 2 = fail): ");
            int result = input.nextInt();

            if (result == 1) {
                passes += 1;
            }
            else {
                failures += 1;
            }
            studentCounter += 1;
        }
        System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);

        if (passes > 8){
            System.out.println("Bonus to Instructor");
        }
    }
}

/**
 * Initialize passes to zero
 * Initialize failures to zero
 * Initialize student counter to one
 * While student counter is less than or equal
 * Prompt the user to enter the next exam
 * Input the next exam result
 * If the student passed
 * Add one to passes
 * Else
 * Add one to failures
 * Add one to student counter
 * Print the number of passes
 * Print the number of failures
 * If more than eight students passed
 * Print “Bonus to instructor!”
 */
