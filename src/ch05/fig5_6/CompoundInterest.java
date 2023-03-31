package ch05.fig5_6;

public class CompoundInterest {
    public static void main(String[] args) {

        double principal = 1000.0;
        double rate = 0.05;

        System.out.printf("%s%20s%n", "Year", "Amount on deposit");

        for (int year = 1; year <= 10; ++year) {
            double amount = principal *  Math.pow(1.0 + rate, year);

            int dollars = (int) (amount);
            double cent = (amount * 10) % 10;
            int cents = (int)cent * 10;
            System.out.printf("%4d%,10.2f %d %s %5d%n", year, amount, dollars, ".", cents);
        }
    }
}

