package ch05.ex05_17;

import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {

        int counter;
        int aCount = 0, bCount = 0, cCount = 0, dCount = 0, fCount = 0;
        String grade, name;

        Scanner scanner = new Scanner(System.in);



        for (counter = 1; counter <= 5; counter++) {
            System.out.print("Student name \t");
            name = scanner.next();
            System.out.print("Enter your letterGrade(A-F): ");
            grade = scanner.next();
            switch (grade) {
                case "A" -> ++aCount;
                case "B" -> ++bCount;
                case "C" -> ++cCount;
                case "D" -> ++dCount;
                default -> ++fCount;
            }
            System.out.printf("%s\t%s%n", name, grade);
        }


            System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n",
                    "Number of students who received each grade:",
                    "A: ", aCount,
                    "B: ", bCount,
                    "C: ", cCount,
                    "D: ", dCount,
                    "F: ", fCount);


    }
}

/*
5.17 (Student Grades) A group of five students earned the following grades: Student 1, ‘A’; student
2, C’; student 3, ‘B’; student 4, ‘A’ and student 5, ‘B’. Write an application that reads a series
of pairs of numbers as follows:
a) student name
b) student letter grade
Your program should use a switch statement to determine how many students got a grade of ‘A’,
how many got a grade of ‘B’, how many got a grade of ‘C’, and how many got a grade of ‘D’. Use a
loop as needed to input the five student grades, and then finally display the results.

 collect number input and student name,
 student name student grade

 convert grade to letter grade

 count number of letter grade
 */
