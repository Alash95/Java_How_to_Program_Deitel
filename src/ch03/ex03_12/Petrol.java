package ch03.ex03_12;

import java.util.Scanner;

public class Petrol {

    public static void main(String[] args) {

        PetrolPurchase tank1 = new PetrolPurchase("Akure", "gas", 50,
                5.0, 0.1);
        PetrolPurchase tank2 = new PetrolPurchase("Yaba", "petrol", 25,
                2.0,0.5);

        System.out.printf("tank1 location is: %s%n", tank1.getLocation());
        System.out.printf("tank1 contains %s%n", tank1.getPetrolType());
        System.out.printf("tank1 net purchase amount after discount is %.2f%n%n", tank1.getPurchaseAmount());

        System.out.printf("tank2 location is: %s%n", tank2.getLocation());
        System.out.printf("tank2 contains %s%n", tank2.getPetrolType());
        System.out.printf("tank2 net purchase amount after discount is %.2f%n", tank2.getPurchaseAmount());





    }

}
