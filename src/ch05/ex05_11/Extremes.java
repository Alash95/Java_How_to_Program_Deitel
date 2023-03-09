package ch05.ex05_11;

import java.util.Scanner;

public class Extremes {
    public static void main(String[] args) {

        int max = 0;
        int min = Integer.MAX_VALUE;
        int counter = 1;
        int number, total = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Input the number of values: ");
        int value = input.nextInt();

        while (counter <= value) {
            number = input.nextInt();

            if (max < number) {
                max = number;
                System.out.print(max);
            }
            if (min > number) {
                min = number;
                System.out.print(min);
            }
            total = min + max;
            counter++;
        }
        System.out.printf("The maximum number is: %d%n", max);
        System.out.printf("The minimum number is: %d%n", min);
        System.out.printf("The total of both max and min is: %d%n", total);

    }

}

/*
5.11 (Extremes) Write an application that finds the minimum and maximum amongst several
integers and then computes the sum of the two extremes. The user will be prompted to input how
many values the application should ask the user to input.

max
min

 */