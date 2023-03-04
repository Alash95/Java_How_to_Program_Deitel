package ch04.ex04_20;

import java.util.Scanner;

public class TaxCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double earnings;
        double taxRate1 = 0.15;
        double taxRate2 = 0.2;
        int citizen = 0;
        double taxPaid;

        System.out.printf("Enter citizen %d earnings: ", citizen+=1);
        earnings = input.nextDouble();

        while (earnings > 0) {
            if (earnings <= 30_000) {
                taxPaid = taxRate1 * earnings;

                System.out.printf("Tax paid for citizen %d is: %.2f%n", citizen, taxPaid);
            }
            else {
                taxPaid = taxRate2 * earnings;

                System.out.printf("Tax paid for citizen %d is: %.2f%n", citizen, taxPaid);
            }
            System.out.printf("Enter citizen %d earnings: ", citizen+=1);
            earnings = input.nextDouble();
        }
    }
}

/*
  4.20 (Tax Calculator)  Develop a Java application that determines the total tax for each of three
  citizens. The tax rate is 15% for earnings up to 30,000 USD earned by each citizen and 20% for all
  earnings in excess of that ceiling. You are given a list with the citizens’ names and their earnings
  in a given year. Your program should input this information for each citizen, then determine and
  display the citizen’s total tax. Use class Scanner to input the data.

  initialize earnings to 0
  initialize taxRate1 & taxRate2 to 15% & 20% respectively
  initialize citizen to zero
  prompt user to enter earnings for each citizen
  input the earnings for each citizen
  if the earnings is greater than 0 or less than or equal to 30000
  set the tax paid to taxRate1 * earnings
  print each citizen's tax paid
  else if the earnings is greater than 30000
  set the tax paid to taxRate2 * earnings
  print each citizen's tax paid
 */