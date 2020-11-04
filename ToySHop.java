import java.util.Scanner;

public class ToySHop {
    public static void main(String[] args) {
        double puzzlePrice = 2.60;
        double talkingDollPrice = 3;
        double teddyBearPrice = 4.10;
        double minionPrice = 8.20;
        double truckPrice = 2;

        Scanner scan = new Scanner(System.in);

        double price = Double.parseDouble(scan.nextLine());
        int puzzles = Integer.parseInt(scan.nextLine());
        int dolls = Integer.parseInt(scan.nextLine());
        int bears = Integer.parseInt(scan.nextLine());
        int minions = Integer.parseInt(scan.nextLine());
        int trucks = Integer.parseInt(scan.nextLine());

        double puzzlesTotal = puzzles * puzzlePrice;
        double dollsTotal = dolls * talkingDollPrice;
        double bearsTotal = bears * teddyBearPrice;
        double minionsTotal = minions * minionPrice;
        double trucksTotal = trucks * truckPrice;

        double sumTotal = puzzlesTotal + dollsTotal + bearsTotal + minionsTotal + trucksTotal;

        int count = puzzles + dolls + bears + minions + trucks;
        if (count >= 50) {
            sumTotal = sumTotal * 0.75;
        }

        double moneyLeft = sumTotal * 0.9;
        double profit = moneyLeft - price;

        if (moneyLeft >= price) {
            System.out.printf("Yes! %.2f lv left.", Math.abs(profit));
        } else System.out.printf("Not enough money! %.2f lv needed.", Math.abs(profit));
    }
}
