package ch03.ex03_13;

import java.util.Scanner;

public class CarApplication {

    public static void main(String[] args) {

        Car car1 = new Car("honda 501", "1995", 500.0);
        Car car2 = new Car("benz C-class", "2023", 200.0);

        Scanner input = new Scanner(System.in);

        System.out.print("Enter discount amount for car2: ");
        double discount = input.nextDouble();
        System.out.printf("%ndiscount on %s price is %.2f%n", car1.getModel(), discount);
        car1.getNewPrice(discount);

        System.out.printf("%nthe net price on %s is: %.2f%n", car1.getModel(), car1.getPrice());
        System.out.printf("%nthe net price on %s is: %.2f%n%n", car2.getModel(), car2.getPrice());

        System.out.print("Enter discount amount for car2: ");
        discount = input.nextDouble();
        System.out.printf("%ndiscount on %s price is %.2f%n", car2.getModel(), discount);
        car2.getNewPrice(discount);

        System.out.printf("%nthe net price on %s is: %.2f%n", car1.getModel(), car1.getPrice());
        System.out.printf("%nthe net price on %s is: %.2f%n", car2.getModel(), car2.getPrice());
    }
}
