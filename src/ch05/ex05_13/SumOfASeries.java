package ch05.ex05_13;

public class SumOfASeries {
    public static void main(String[] args) {

        int number;
        int sum = 0;
        System.out.printf("%6s%8s%n", "number", "sum");
        for (number = 1; number <= 100 ; number++) {
            sum += number;
            System.out.printf("%4d%10d%n",number, sum);
        }
    }
}

/*
5.13 (The Sum of a Series)  Find the summation of the sequence of numbers 1, 2, 3 … n, where
n ranges from 1 to 100. Use type long. Display the results in a tabular format that shows n and the
corresponding sum. If this were a product instead of a sum, what difficulty might you encounter
with the variable that accumulates the product?
 */