import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double coffeePrice = 0;
        double waterPrice = 0;
        double beerPrice = 0;
        double sweetsPrice = 0;
        double peanutsPrice = 0;
        double price = 0;
        String product = scan.nextLine();
        String city = scan.nextLine();
        double quantity = Double.parseDouble(scan.nextLine());

        switch (city){
            case "Sofia":
                coffeePrice = 0.5;
                waterPrice = 0.8;
                beerPrice = 1.2;
                sweetsPrice = 1.45;
                peanutsPrice = 1.6;

                switch (product) {
                    case "coffee": price = coffeePrice * quantity;
                        break;
                    case "water": price = waterPrice * quantity;
                        break;
                    case "beer": price = beerPrice * quantity;
                        break;
                    case "sweets": price = sweetsPrice * quantity;
                        break;
                    case "peanuts": price = peanutsPrice * quantity;
                        break;
                }
                break;

            case "Plovdiv":
                coffeePrice = 0.4;
                waterPrice = 0.7;
                beerPrice = 1.15;
                sweetsPrice = 1.3;
                peanutsPrice = 1.5;

                switch (product) {
                    case "coffee": price = coffeePrice * quantity;
                        break;
                    case "water": price = waterPrice * quantity;
                        break;
                    case "beer": price = beerPrice * quantity;
                        break;
                    case "sweets": price = sweetsPrice * quantity;
                        break;
                    case "peanuts": price = peanutsPrice * quantity;
                        break;
                }
                break;

            case "Varna":
                coffeePrice = 0.45;
                waterPrice = 0.7;
                beerPrice = 1.1;
                sweetsPrice = 1.35;
                peanutsPrice = 1.55;

                switch (product) {
                    case "coffee": price = coffeePrice * quantity;
                        break;
                    case "water": price = waterPrice * quantity;
                        break;
                    case "beer": price = beerPrice * quantity;
                        break;
                    case "sweets": price = sweetsPrice * quantity;
                        break;
                    case "peanuts": price = peanutsPrice * quantity;
                        break;
                }
                break;
        }
        System.out.printf("%f", price);
    }
}
