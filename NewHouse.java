import jdk.jfr.Percentage;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double rose = 5;
        double dhalia = 3.80;
        double tullip = 2.8;
        double narcis = 3;
        double gladiola = 2.5;
        double finalPrice = 0;

        String typeFlowers = scan.nextLine();
        int flowers = Integer.parseInt(scan.nextLine());
        double budget = Double.parseDouble(scan.nextLine());

        switch (typeFlowers) {
            case "Roses": {
                finalPrice = rose * flowers;
                if (flowers > 80)
                    finalPrice = finalPrice * 0.9;
                break;
            }

            case "Dahlias": {
                finalPrice = dhalia * flowers;
                if (flowers > 90)
                    finalPrice = finalPrice * 0.85;
                break;
            }

            case "Tulips": {
                finalPrice = tullip * flowers;
                if (flowers > 80)
                    finalPrice = finalPrice * 0.85;
                break;
            }
            case "Narcissus": {
                finalPrice = narcis * flowers;
                if (flowers < 120)
                    finalPrice = finalPrice * 1.15;
                break;
            }

            case "Gladiolus": {
                finalPrice = gladiola * flowers;
                if (flowers < 80)
                    finalPrice = finalPrice * 1.2;
                break;
            }
        }
        double moneyLeft = budget - finalPrice;
        if (finalPrice <= budget) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowers, typeFlowers, Math.abs(moneyLeft));
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", Math.abs(moneyLeft));
        }
    }
}
