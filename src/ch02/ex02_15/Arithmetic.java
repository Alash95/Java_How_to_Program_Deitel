/**
 * 2.15 (Arithmetic) Write an application that asks the user to enter two integers, obtains them from
 *  the user and prints the square of each, the sum of their squares, and the difference of the squares (first
 *  number squared minus the second number squared). Use the techniques shown in Fig. 2.7.
 *
 *  Author: Oyinlola Alasoluyi
 */


package ch02.ex02_15;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {

        int num1, num2;
        int squareNum1, squareNum2, sumOfSquare, diffOfSquares;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number:  ");
        num1 = input.nextInt();


        System.out.print("Enter second number: ");
        num2 = input.nextInt();

        squareNum1 = (num1 * num1);
        squareNum2 = (num2 * num2);
        sumOfSquare = squareNum1 + squareNum2;
        diffOfSquares = squareNum1 - squareNum2;


        System.out.printf("the square of first number =  %d%n", squareNum1);
        System.out.printf("the square of second number =  %d%n", squareNum2);
        System.out.printf("the sum of each numbers square =  %d%n", sumOfSquare);
        System.out.printf("the difference of each numbers square =  %d", diffOfSquares);
    }
}