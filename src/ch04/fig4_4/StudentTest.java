package ch04.fig4_4;

public class StudentTest {

    public static void main(String[] args) {

        Student student1 = new Student("Oyinlola", 80.5);
        Student student2 = new Student("Desayo", 65.4);

        displayGrades(student1);
        displayGrades(student2);

    }

    private static void displayGrades(Student student) {
        System.out.printf("%s's Letter Grade is: %s%n", student.getName(), student.getLetterGrade());
    }
}
