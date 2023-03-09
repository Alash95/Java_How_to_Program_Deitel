package ch05.ex05_12;

public class IntegersDivisibleByThree {
    public static void main(String[] args) {

        int total = 0;
        for (int number = 1; number <= 30 ; number++) {
            if ((number % 3) == 0) {
                total += number;
            }
        }
        System.out.println("The total of numbers divisible by 30 is: "+total);
    }
}

/*
5.12
(Integers Divisible by 3) Write an application that calculates the sum of those integers between
1 and 30 that are divisible by 3.
 */
