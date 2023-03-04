package ch04.ex04_30;

import java.util.Scanner;

public class RightAngleTriangle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of the triangle base: ");
         int sides = input.nextInt();
         input.close();

         int i = 0;
         while (i++ < sides) {
             int j = 0;

             while (j++ < i){

                 System.out.print("* ");
                 System.out.println();
             }
         }
    }
}
