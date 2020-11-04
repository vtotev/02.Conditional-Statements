import jdk.jfr.Percentage;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int springCost = 3000;
        int summerAutumnCost = 4200;
        int winterCost = 2600;

        int budget = Integer.parseInt(scan.nextLine());
        String season = scan.nextLine();
        int fishman = Integer.parseInt(scan.nextLine());
        double costs = 0;
        double discount = 0;
        double withDiscount = 0;

        if (fishman <= 6) {
            discount = 10;
        } else if (fishman >= 7 && fishman <= 11) {
            discount = 15;
        } else  if (fishman>= 12 ) {
            discount = 25;
        }

        switch (season) {
            case "Spring": {
                costs = springCost;
                break;
            }
            case "Winter": {
                costs = winterCost;
                break;
            }
            case "Summer":
            case "Autumn":
                costs = summerAutumnCost;
                break;
        }
        withDiscount = costs * (1 - (discount / 100));

        if (fishman % 2 == 0 && !season.equals("Autumn")) {
            withDiscount = withDiscount * 0.95;
        }

        if (budget >= withDiscount) {
            System.out.printf("Yes! You have %.2f leva left.", Math.abs(budget - withDiscount));
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", Math.abs(budget - withDiscount));
        }
    }
}
