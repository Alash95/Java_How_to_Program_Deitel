package ch04.ex04_34;

import java.util.Scanner;

public class SpecifiedSum {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num, count = 0, sum = 0;

        System.out.print("Enter a number: ");
        num = scan.nextInt();

        if (sum >= num){
            System.out.print(sum);
        }
        else {
            while (sum < num) {
                sum+=count;
//                System.out.print(sum);
                count++;
            }
            System.out.printf("sum is: %d, while count is: %d", sum, count);
        }
    }
}

/*
4.34 (Reading numbers until a specified sum) Write an application that asks for a number from
the user and then keeps reading integer values from the user until the sum of those integers equals
or becomes greater than the value that was input in the beginning.
 */
