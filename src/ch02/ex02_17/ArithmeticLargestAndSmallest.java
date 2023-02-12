/**
 * 2.24 (Largest and Smallest Integers) Write an application that reads five integers and determines
 * and prints the largest and smallest integers in the group. Use only the programming techniques you
 * learned in this chapter.
 *
 * Author: Oyinlola Alasoluyi
 */

package ch02.ex02_17;

import java.util.Scanner;

public class ArithmeticLargestAndSmallest {

    public static void main(String[] args) {

        int num1, num2, num3, num4, num5;
        int largest, smallest;

        Scanner input = new Scanner(System.in);

        System.out.println("input integers: ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();
        num4 = input.nextInt();
        num5 = input.nextInt();

        largest = num1;
        if (num2 > largest) {
            largest = num2;
        }

        if (num3 > largest) {
            largest = num3;
        }

        if (num4 > largest) {
            largest = num4;
        }

        if (num5 > largest) {
            largest = num5;
        }

        smallest = num1;
        if (num2 < smallest) {
            smallest = num2;
        }

        if (num3 < smallest) {
            smallest = num3;
        }

        if (num4 < smallest) {
            smallest = num4;
        }

        if (num5 < smallest) {
            smallest = num5;
        }

        System.out.printf("The largest number is:  %d%n", largest);
        System.out.printf("The smallest number is:  %d%n", smallest);



    }
}
