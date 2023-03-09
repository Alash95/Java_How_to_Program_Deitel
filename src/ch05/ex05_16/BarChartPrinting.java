package ch05.ex05_16;

import java.util.Scanner;

public class BarChartPrinting {

    public static void main(String[] args) {
        int number;
        int counter = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose number and i'll show the star");
        for (int i = 1; i <= 30; i++) {
            if (counter <= 5) {
                number = scanner.nextInt();
                for (int j = 1; j <= number; j++) {
                    System.out.print("*");
                }
            } else {
                scanner.close();
            }
            counter++;
            System.out.println();
        }
    }
}


/*
5.16 (Bar-Chart Printing Program) One interesting application of computers is to display
graphs and bar charts. Write an application that reads five numbers between 1 and 30. For each
number that’s read, your program should display the same number of adjacent asterisks. For example,
if your program reads the number 7, it should display *******. Display the bars of asterisks after
you read all five numbers.
 */


