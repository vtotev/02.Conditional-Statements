import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double bananaPrice = 0;
        double applePrice = 0;
        double orangePrice = 0;
        double grapefruitPrice = 0;
        double kiwiPrice = 0;
        double pineapplePrice = 0;
        double grapesPrice = 0;
        double price = 0;

        String fruit = scan.nextLine();
        String day = scan.nextLine();
        double quantity = Double.parseDouble(scan.nextLine());

        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                bananaPrice = 2.5;
                applePrice = 1.2;
                orangePrice = 0.85;
                grapefruitPrice = 1.45;
                kiwiPrice = 2.7;
                pineapplePrice = 5.5;
                grapesPrice = 3.85;
                switch (fruit) {
                    case "banana": price = bananaPrice * quantity; break;
                    case "apple": price = applePrice * quantity; break;
                    case "orange": price = orangePrice * quantity; break;
                    case "grapefruit": price = grapefruitPrice * quantity; break;
                    case "kiwi": price = kiwiPrice * quantity; break;
                    case "pineapple": price = pineapplePrice * quantity; break;
                    case "grapes": price = grapesPrice * quantity; break;
                    default: price = 0; break;
                }
                if (price != 0) { System.out.printf("%.2f", price); }
                else System.out.println("error");
                break;

            case "Saturday":
            case "Sunday":
                bananaPrice = 2.7;
                applePrice = 1.25;
                orangePrice = 0.9;
                grapefruitPrice = 1.6;
                kiwiPrice = 3.0;
                pineapplePrice = 5.6;
                grapesPrice = 4.2;
                switch (fruit) {
                    case "banana": price = bananaPrice * quantity; break;
                    case "apple": price = applePrice * quantity; break;
                    case "orange": price = orangePrice * quantity; break;
                    case "grapefruit": price = grapefruitPrice * quantity; break;
                    case "kiwi": price = kiwiPrice * quantity; break;
                    case "pineapple": price = pineapplePrice * quantity; break;
                    case "grapes": price = grapesPrice * quantity; break;
                    default: price = 0; break;
                }
                if (price != 0) { System.out.printf("%.2f", price); }
                else System.out.println("error");
                break;

            default:
                System.out.println("error");
                break;
        }

    }
}
