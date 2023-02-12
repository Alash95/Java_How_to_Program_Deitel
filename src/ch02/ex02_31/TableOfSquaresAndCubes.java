/**
 * 2.31 (Table of Squares and Cubes) Using only the programming techniques you learned in this
 * chapter, write an application that calculates the squares and cubes of the numbers from 0 to 10 and
 * prints the resulting values in table format, as shown below.
 *
 * number  square  cube
 * 0       0       0
 * 1       1       1
 * 2       4       8
 * 3       9       27
 * 4       16      64
 * 5       25      125
 * 6       36      216
 * 7       49      343
 * 8       64      512
 * 9       81      729
 * 10      100     1000
 */


package ch02.ex02_31;

public class TableOfSquaresAndCubes {

    public static void main(String[] args) {

        int num0 = 0, num1 = 1, num2 = 2, num3 = 3, num4 = 4, num5 = 5,
                num6 = 6, num7 = 7, num8 = 8, num9 = 9, num10 = 10;

        System.out.printf("%s   %s  %2s%n", "number", "square", "cube");
        System.out.printf("%d       %2d      %2d%n", num0, num0 * num0, num0 * num0 * num0);
        System.out.printf("%d       %2d      %2d%n", num1, num1 *num1, num1 * num1 * num1);
        System.out.printf("%d       %2d      %2d%n", num2, num2 *num2, num2 * num2 * num2);
        System.out.printf("%d       %2d      %2d%n", num3, num3 *num3, num3 * num3 * num3);
        System.out.printf("%d       %2d      %2d%n", num4, num4 *num4, num4 * num4 * num4);
        System.out.printf("%d       %2d      %2d%n", num5, num5 *num5, num5 * num5 * num5);
        System.out.printf("%d       %2d      %2d%n", num6, num6 *num6, num6 * num6 * num6);
        System.out.printf("%d       %2d      %2d%n", num7, num7 *num7, num7 * num7 * num7);
        System.out.printf("%d       %2d      %2d%n", num8, num8 *num8, num8 * num8 * num8);
        System.out.printf("%d       %2d      %2d%n", num9, num9 *num9, num9 * num9 * num9);
        System.out.printf("%d      %d     %d%n", num10, num10 *num10, num10 * num10 * num10);
    }
}
