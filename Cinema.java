import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        double premiere = 12;
        double normal = 7.50;
        double discount = 5;

        Scanner scan = new Scanner(System.in);
        String typeCinema = scan.nextLine();
        int rows = Integer.parseInt(scan.nextLine());
        int columns = Integer.parseInt(scan.nextLine());
        int seats = rows * columns;
        double costs = 0;

        switch (typeCinema) {
            case "Premiere": {
                costs = seats * premiere;
                break;
            }
            case "Normal": {
                costs = seats * normal;
                break;
            }
            case "Discount": {
                costs = seats * discount;
                break;
            }
        }
        System.out.printf("%.2f leva", costs);
    }
}
