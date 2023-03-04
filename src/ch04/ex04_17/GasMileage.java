package ch04.ex04_17;

import java.util.Scanner;

public class GasMileage {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);



        int milesUsed = 0;
        int gallonsUsed = 0;
        int trip = 0;

        System.out.println("Enter the gallon used or -1 to quit: ");
        int gallons = input.nextInt();
        System.out.println("Enter the mileage used or -1 to quit: ");
        int miles = input.nextInt();

        while (miles != -1 && gallons != -1) {
            milesUsed += miles;
            gallonsUsed += gallons;
            trip += 1;

            System.out.println("Enter the gallon used or -1 to quit: ");
            gallons = input.nextInt();
            System.out.println("Enter the mileage used or -1 to quit: ");
            miles = input.nextInt();
        }

        if (trip != 0) {
            double gasMileage = (double) milesUsed / gallonsUsed;


            System.out.printf("%nThe total miles travelled for %d trips is: %d", trip, milesUsed);
            System.out.printf("%nThe total gallons used for %d trips is: %d", trip, gallonsUsed);
            System.out.printf("%nThe average gas mileage for %d trips is: %.2f", trip, gasMileage);
        }
        else {
            System.out.println("No values entered");
        }
    }
}


/**
 * Develop a Java application that will input the miles driven and gallons used
 * (both as integers) for each trip. The program should calculate and display the
 * miles per gallon obtained for each trip and print the combined miles per gallon
 * obtained for all trips up to this point. All averaging calculations should produce
 * floating-point results. Use class Scanner and sentinel-controlled iteration to
 * obtain the data from the user.
 */

/**
 *  Initialize miles to zero
 *  Initialize gallons to zero
 *  initialize trip to zero
 *  Prompt the user to enter the first mile and gallon used
 *  Input the first mile and gallon used(possibly the sentinel)
 *  While the user has not yet entered the sentinel
 *  Add the miles used and the gallons used to the running total
 *  Add one to the trip
 *  Prompt the user to enter the next mile and gallon used
 *  input the next mile and gallon used(possibly the sentinel)
 *  if the trip is not equal to zero
 *  Set the gasMileage to the miles divided by the gallons
 *  print the average
 *  Else
 *  Print "No values  inputted"
 */

