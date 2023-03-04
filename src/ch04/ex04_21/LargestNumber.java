package ch04.ex04_21;

import java.util.Scanner;

public class LargestNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter = 1;
        int number;
        int largest = 0, smallest = 0;

        while (counter <= 10) {
            System.out.printf("Enter number %d: ", counter);
            number = input.nextInt();

            if (largest < number) {
                smallest = largest;
                largest = number;
            }
            else if (smallest < number) {
                smallest = number;
            }
            counter++;
        }
        System.out.printf("The largest number is: %d%n", largest);
        System.out.printf("The second largest number is: %d%n", smallest);

    }



}

/*
4.21 (Find the Largest Number) The process of finding the largest value is used frequently in computer
applications. For example, a program that determines the winner of a sales contest would input the
number of units sold by each salesperson. The salesperson who sells the most units wins the contest.
Write a pseudocode program,then a Java application that inputs a series of 10 integers and determines
and prints the largest integer. Your program should use at least the following three variables:
a) counter: A counter to count to 10 (i.e., to keep track of how many numbers have been
input and to determine when all 10 numbers have been processed).
b) number: The integer most recently input by the user.
c) largest: The largest number found so far.

initialize counter to zero
initialize number to zero
initialize largest to zero
while counter is less than or equal to ten
prompt user to input the first number
input the next number
add one to the counter
if number is greater than 0;
set number to equal largest
else if number is less than the largest
set largest to equal number
print largest
 */
