package ch03.ex03_16;

public class HeartRates {

    private String firstName;
    private String lastName;
    private int day;
    private String month;
    private int year;

    public HeartRates(String firstName, String lastName,
                      int day, String month, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.day = day;
        this.month = month;
        this.year = year;
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

    public int getAge() {
       return 2023 - year;
    }

    public int getMaximumHeartRate() {
        return 220 - getAge();

    }

    public String getTargetHeartRate() {
        return String.format("%n%.2f - %.2f", getMaximumHeartRate() * 0.5, getMaximumHeartRate() * 0.85);
    }

}
