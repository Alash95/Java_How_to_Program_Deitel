package ch03.ex03_16;

import java.util.Scanner;

public class HeartRatesTest {

    public static void main(String[] args) {

        HeartRates patient1 = new HeartRates("Oyinlola", "Alasho", 20, "May", 1995);
        HeartRates patient2 = new HeartRates("Desayo", "Tomilola", 9, "January", 2000);

        displayHeartRates(patient1);
        displayHeartRates(patient2);

        displayAge(patient1);
        displayAge(patient2);

        displayMaximumHeartRate(patient1);
        displayMaximumHeartRate(patient2);

        displayTargetHeartRate(patient1);
        displayTargetHeartRate(patient2);


    }

    public static void displayHeartRates(HeartRates heartRates) {
        System.out.printf("%n%s %s, was born on %dth, %s, %d.%n%n", heartRates.getFirstName(),
                heartRates.getLastName(), heartRates.getDay(), heartRates.getMonth(), heartRates.getYear());
    }

    public static void displayAge(HeartRates age) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Enter your year of birth %s%n", age.getFirstName());

        int year = input.nextInt();
        age.setYear(year);
        System.out.printf("%n%s, your age is %d%n", age.getFirstName(), age.getAge());
    }

    public static void displayMaximumHeartRate(HeartRates maximumHeartRate) {
        System.out.printf("%n%s your maximum heart rate is: %d%n", maximumHeartRate.getFirstName(), maximumHeartRate.getMaximumHeartRate());
    }

    public static void displayTargetHeartRate(HeartRates targetHeartRate) {
        System.out.printf("%n%s your target heart rate is: %s", targetHeartRate.getFirstName(), targetHeartRate.getTargetHeartRate());
    }
}
