/**
 * 2.25 (Divisible by 3) Write an application that reads an integer and determines and prints
 * whether it’s divisible by 3 or not. [Hint: Use the remainder operator. A number is divisible by 3 if
 * it’s divided by 3 with a remainder of 0.]
 *
 * Author: Oyinlola Alasoluyi
 */



package ch02.ex02_25;

import java.util.Scanner;

public class Divisible {

    public static void main(String[] args) {

        int number, divisor = 3;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        number = input.nextInt();

        if (number % divisor == 0){
            System.out.printf("%d is divisible by %d%n", number, divisor);
        }
        else {
            System.out.printf("%d is not divisible by %d%n", number, divisor);
        }

    }

}
