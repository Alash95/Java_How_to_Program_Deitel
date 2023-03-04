package ch04.ex04_36;

import java.util.Scanner;

public class Comparator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input first number: \n");
        int num1 = input.nextInt();

        System.out.println("Input second number: ");
        int num2 = input.nextInt();

        if (num1 == num2){
            System.out.println(0);
        }
        else if (num1 > num2){
            System.out.println(1);
        }
        else {
            System.out.println(-1);
        }
    }
}

/*
4.36 (Creating a Comparator) Write an application that works as a comparator. Your program
should read two numbers from the user and print 0 if they are equal to each other, 1 if the first
number is greater, and –1 if the second number is greater.
 */
