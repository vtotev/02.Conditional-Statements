import java.util.Scanner;

public class GodzillaKong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        int statisti = Integer.parseInt(scan.nextLine());
        double priceClothes = Double.parseDouble(scan.nextLine());

        double statistiExpenses = statisti * priceClothes;

        double dekor = budget * 0.1;
        if (statisti > 150) {
            statistiExpenses = statistiExpenses * 0.9;
        }
        double expenses = dekor + statistiExpenses;
        double moneyLeft = budget - expenses;
        if (budget >= expenses) {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", moneyLeft);
        } else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", Math.abs(moneyLeft));
        }
    }
}
