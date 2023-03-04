package ch03.ex03_17;


import java.util.Scanner;

public class HealthProfileTest {

    public static void main(String[] args) {

        HealthProfile profile1 = new HealthProfile("Oyinlola", "Alasho", "Male",
                20, "May", 1995,1.74, 90);
        HealthProfile profile2 = new HealthProfile("Desayo", "Tomilola", "Female",
                9, "January", 2000,1.64, 51);

        displayHealthProfile(profile1);
        displayHealthProfile(profile2);

        displayAge(profile1);
        displayAge(profile2);

        displayMaximumHeartRate(profile1);
        displayMaximumHeartRate(profile2);

        displayTargetHeartRate(profile1);
        displayTargetHeartRate(profile2);

        displayBMI(profile1);
        displayBMI(profile2);

    }

    private static void displayBMI(HealthProfile bmi) {
        Scanner input = new Scanner(System.in);

        System.out.printf("%n%s enter your weight in kilograms: ", bmi.getFirstName());
        double weight = input.nextDouble();
        bmi.setWeight(weight);
        System.out.printf("%n%s enter your height in metres: ", bmi.getFirstName());
        double height = input.nextDouble();
        bmi.setHeight(height);

        System.out.printf("Your BMI is: %,.2f%n%n", bmi.getBMI());

        System.out.println("Underweight = <18.5\r\n" + "Normal weight = 18.5–24.9\r\n" + "Overweight = 25–29.9\r\n" +
                "Obesity = BMI of 30 or greater\r\n");


    }

    private static void displayHealthProfile(HealthProfile profile) {
        System.out.printf("%n%s %s is a %s. %n%s was born on %dth %s %d. %n%s's height is: %.2f. %n%s's weight is:  %.2f.%n%n",
                profile.getFirstName(), profile.getLastName(),profile.getGender(),
                profile.getFirstName(), profile.getDay(), profile.getMonth(), profile.getYear(),
                profile.getFirstName(), profile.getHeight(), profile.getFirstName(), profile.getWeight());
    }

    public static void displayAge(HealthProfile age) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Enter your year of birth %s%n", age.getFirstName());

        int year = input.nextInt();
        age.setYear(year);
        System.out.printf("%n%s, your age is %d%n", age.getFirstName(), age.getAge());
    }

    public static void displayMaximumHeartRate(HealthProfile maximumHeartRate) {
        System.out.printf("%n%s your maximum heart rate is: %d%n", maximumHeartRate.getFirstName(), maximumHeartRate.getMaximumHeartRate());
    }

    public static void displayTargetHeartRate(HealthProfile targetHeartRate) {
        System.out.printf("%n%s your target heart rate is: %s", targetHeartRate.getFirstName(), targetHeartRate.getTargetHeartRate());
    }



}
