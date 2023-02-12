/**
 * 2.33 (Body Mass Index Calculator) We introduced the body mass index
 * (BMI) calculator in Exercise 1.10 . The formulas for calculating BMI are
 *
 *   		BMI = (weightInPounds x 703) / (heightInInches * heightInInches)
 *   				  or
 *   		BMI = weightInKilograms / (heightInMeters x heightInMeters)
 *
 * Create a BMI calculator that reads the user’s weight in pounds and height
 * in inches (or, if you prefer, the user’s weight in kilograms and height in
 * meters), then calculates and displays the user’s body mass index. Also,
 * display the BMI categories and their values from the National Heart Lung
 * and Blood Institute
 *   BMI Categories:
 * Underweight = <18.5
 * Normal weight = 18.5–24.9
 * Overweight = 25–29.9
 * Obesity = BMI of 30 or greater
 *
 * [Note: In this chapter, you learned to use the int type to represent whole
 * numbers. The BMI calculations when done with int values will both
 * produce whole-number results. In Chapter 3 you’ll learn to use the
 * double type to represent numbers with decimal points. When the BMI
 * calculations are performed with doubles, they’ll both produce numbers
 * with decimal points—these are called “floating-point” numbers.]
 */


package ch02.ex02_33;

import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your weight in kilograms: ");
        double weightInKilograms = input.nextDouble();

        System.out.println("Enter your height in metres: ");
        double heightInMetres = input.nextDouble();

        double bmi = weightInKilograms / (heightInMetres * heightInMetres);

        System.out.printf("Your BMI is: %,.2f%n%n", bmi);

        System.out.println("Underweight = <18.5\r\n" + "Normal weight = 18.5–24.9\r\n" + "Overweight = 25–29.9\r\n" +
             "Obesity = BMI of 30 or greater\r\n");

    }
}
