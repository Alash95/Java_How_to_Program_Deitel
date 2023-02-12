/**
 * 2.16 (Comparing Integers) Write an application that asks the user to enter one integer, obtains
 * it from the user and displays whether the number and its square are greater than, equal to, not equal
 * to, or less than the number 100. Use the techniques shown in Fig. 2.15.
 *
 * Author: Oyinlola Alasoluyi
 */


package ch02.ex02_16;

import java.util.Scanner;

public class Comparison {

    public static void main(String[] args) {

        int num1, num2 = 100, squareNum1;

        Scanner input = new Scanner(System.in);

        System.out.println("Input any integer: ");
        num1 = input.nextInt();

        squareNum1 = num1 * num1;

        integer(num1, num2);

        square(squareNum1, num2);
    }

    private static void square(int squareNum1, int num2) {
        if (squareNum1 > num2)
            System.out.printf("%d is greater than %d%n", squareNum1, num2);

        if (squareNum1 == num2)
            System.out.printf("%d is equal to %d%n", squareNum1, num2);

        if (squareNum1 != num2)
            System.out.printf("%d is not equal to %d%n", squareNum1, num2);

        if (squareNum1 < num2)
            System.out.printf("%d is less than %d%n", squareNum1, num2);
    }

    public static void integer(int num1, int num2) {
        if (num1 > num2)
            System.out.printf("%d is greater than %d%n", num1, num2);

        if (num1 == num2)
            System.out.printf("%d is equal to %d%n", num1, num2);

        if (num1 != num2)
            System.out.printf("%d is not equal to %d%n", num1, num2);

        if (num1 < num2)
            System.out.printf("%d is less than %d%n", num1, num2);
    }
}
