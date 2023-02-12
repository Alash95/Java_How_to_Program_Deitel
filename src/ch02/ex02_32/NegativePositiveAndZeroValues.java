/**
 * 2.32  (Negative, Positive and Zero Values) Write a program that inputs five numbers and determines
 * and prints the number of negative numbers input, the number of positive numbers input and the number of zeros input.
 */


package ch02.ex02_32;

import java.util.Scanner;

public class NegativePositiveAndZeroValues {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input first number: ");
        int number1 = input.nextInt();

        System.out.println("Input second number: ");
        int number2 = input.nextInt();

        System.out.println("Input third number: ");
        int number3 = input.nextInt();

        System.out.println("Input fourth number: ");
        int number4 = input.nextInt();

        System.out.println("Input fifth number: ");
        int number5 = input.nextInt();

        int positive = 0, negative = 0, zero = 0;

        if (number1 == 0)
            zero++;
        if (number2 == 0)
            zero++;
        if (number3 == 0)
            zero++;
        if (number4 == 0)
            zero++;
        if (number5 == 0)
            zero++;

        if (number1 < 0)
            negative++;
        if (number2 < 0)
            negative++;
        if (number3 < 0)
            negative++;
        if (number4 < 0)
            negative++;
        if (number5 < 0)
            negative++;

        if (number1 > 0)
            positive++;
        if (number2 > 0)
            positive++;
        if (number3 > 0)
            positive++;
        if (number4 > 0)
            positive++;
        if (number5 > 0)
            positive++;

        System.out.printf("Total positive number is: %d%n", positive);
        System.out.printf("Total negative number is: %d%n", negative);
        System.out.printf("Total zeros number is: %d%n", zero);
    }
}
