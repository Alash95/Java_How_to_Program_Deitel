package ch05;


public class Testing {
    public static void main(String[] args) {
        double amount = 8421.43;

        int dollars = (int) (amount);
        double dcent = (amount * 10) % 10;
        System.out.printf("dcent = %.2f", dcent);
        int cent = (int) (dcent * 10);
        System.out.printf("dollars = %d, cent = %d", dollars, cent);

    }
}
