/**
 * 2.26 (Multiples) Write an application that reads two integers, determines whether the first
 * number tripled is a multiple of the second number doubled, and prints the result. [Hint: Use the
 * remainder operator.]
 *
 * Author: Oyinlola Alasoluyi
 */


package ch02.ex02_26;

import java.util.Scanner;

public class Multiple {

    public static void main(String[] args) {

        int number1, number2, tripled, doubled;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: ");
        number1 = input.nextInt();

        System.out.println("Enter second number: ");
        number2 = input.nextInt();

        tripled = number1 * number1 * number1;
        System.out.printf("triple of %d is %d%n", number1, tripled);

        doubled = number2 * number2;
        System.out.printf("double of %d is %d%n", number2, doubled);

        if (tripled % doubled == 0){
            System.out.printf("%d is a multiple of %d%n", number1, number2);
        }
        else {
            System.out.printf("%d is not a multiple of %d%n", number1, number2);
        }
    }

}
