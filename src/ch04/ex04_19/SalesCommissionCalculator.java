package ch04.ex04_19;

import java.util.Scanner;

public class SalesCommissionCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int item = 0;
        double itemValue = 0;
        int basePay = 200;
        double commission = 0.09;

        System.out.printf("Enter the item value for item %d or 0 to quit: ", item+=1);
        double value = input.nextDouble();

        while (value > 0) {
            itemValue += value ;
            item += 1;

            System.out.printf("Enter the item value for item %d or 0 to quit: ", item);
            value = input.nextDouble();
        }
        if (item > 0) {
            double salesCommission = (double) basePay + commission * itemValue;

            System.out.printf("Total sales commission for %d items is: %.2f", item, salesCommission);
        }
        else {
            System.out.println("No values were inputted");
        }
    }
}

/*
  4.19 (Sales Commission Calculator) A large company pays its salespeople on a
  commission basis. The salespeople receive $200 per week plus 9% of their
  gross sales for that week. For example, a salesperson who sells $5,000 worth of
  merchandise in a week receives $200 plus 9% of $5,000, or a total of $650.
  You’ve been supplied with a list of the items sold by each salesperson. The values
  of these items are shown in Fig. 4.33. Develop a Java application that inputs
  one salesperson’s items sold for last week and calculates and displays that
  salesperson’s earnings. There’s no limit to the number of items that can be sold.
 */

/*
  Initialize item to zero
  Initialize itemValue to zero
  Initialize basePay to 200
  Initialize sales commission to 0.09
  Prompt user to enter item value
  Input the first item value (or possibly sentinel)
  While the user has not entered the sentinel
  add the itemValue and item to their running total
  add one to the item
  prompt user to enter the next item value
  input the next item value (or possibly sentinel)
  if the item is greater than 0
  set the sales commission to basePay plus commission * totalSales
  print the sales commission
  else
  print "No Values Inputted"
 */
