package ch03.ex03_17;

public class HealthProfile {

    private String firstName;
    private String lastName;
    private String gender;
    private int day;
    private String month;
    private int year;
    private double height;
    private double weight;

    public HealthProfile(String firstName, String lastName, String gender,
                         int day, String month, int year, double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.day = day;
        this.month = month;
        this.year = year;
        this.height = height;
        this.weight = weight;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getMonth() {
        return month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public  int getAge() {
        return 2023 - getYear();
    }

    public int getMaximumHeartRate() {
        return 220 - getAge();
    }

    public String getTargetHeartRate() {
       return String.format("%n%.2f - %.2f", getMaximumHeartRate() * 0.5, getMaximumHeartRate() * 0.85);
    }

    public double getBMI() {
        double bmi = weight / (height * height);
        return bmi;
    }
}
