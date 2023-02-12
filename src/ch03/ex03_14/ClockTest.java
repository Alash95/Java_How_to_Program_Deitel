package ch03.ex03_14;

public class ClockTest {

    public static void main(String[] args) {

        Clock clock1 = new Clock(23, 54, 59);
        Clock clock2 = new Clock(24, 60, 59);

        clock1.displayTime();
        System.out.println();
        clock2.displayTime();

        clock1.setHour(18);
        clock1.setMinute(25);
        clock1.setSecond(35);

        System.out.println();

        clock1.displayTime();

         clock2.setHour(24);
         clock2.setMinute(60);
         clock2.setSecond(59);

         clock2.displayTime();
    }

}
