import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();
        double camp = 0;

        switch (season) {
            case "summer":
                if (budget <= 100) {
                    camp = budget * 0.3;
                    System.out.println("Somewhere in Bulgaria");
                    System.out.printf("Camp - %.2f", camp);
                } else if (budget > 100 && budget <=1000) {
                    camp = budget * 0.4;
                    System.out.println("Somewhere in Balkans");
                    System.out.printf("Camp - %.2f", camp);
                } else if (budget > 1000) {
                    camp = budget * 0.9;
                    System.out.println("Somewhere in Europe");
                    System.out.printf("Hotel - %.2f", camp);
                }
                break;
            case "winter":
                if (budget <= 100) {
                    camp = budget * 0.7;
                    System.out.println("Somewhere in Bulgaria");
                    System.out.printf("Hotel - %.2f", camp);
                } else if (budget > 100 && budget <=1000) {
                    camp = budget * 0.8;
                    System.out.println("Somewhere in Balkans");
                    System.out.printf("Hotel - %.2f", camp);
                } else if (budget > 1000) {
                    camp = budget * 0.9;
                    System.out.println("Somewhere in Europe");
                    System.out.printf("Hotel - %.2f", camp);
                }
                break;
        }
    }
}
