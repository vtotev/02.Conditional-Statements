import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String month = scan.nextLine();
        int days = Integer.parseInt(scan.nextLine());
        int discountStudio = 0;
        int discountApartment = 0;
        double studio = 0;
        double apartment = 0;
        double priceStudio = 0;
        double priceApartment = 0;
        if (days > 14) { discountApartment = 10; };

        switch (month)
        {

            case "May":
            case "October":
                studio = 50;
                apartment = 65;
                if (days > 7 && days <= 14) {
                    discountStudio = 5;
                } else if (days > 14) {
                    discountStudio = 30;
                }
                priceStudio = days * studio;
                priceStudio = priceStudio * (1 - ((discountStudio * 1.00) / 100));
                priceApartment = days * apartment;
                priceApartment = priceApartment * (1 - ((discountApartment * 1.00) / 100));

                System.out.printf("Apartment: %.2f lv.", priceApartment);
                System.out.println();
                System.out.printf("Studio: %.2f lv.", priceStudio);
                break;


            case "June":
            case "September":
                studio = 75.20;
                apartment = 68.70;
                if (days > 14) {
                    discountStudio = 20;
                }
                priceStudio = days * studio;
                priceStudio = priceStudio * (1 - ((discountStudio * 1.00) / 100));
                priceApartment = days * apartment;
                priceApartment = priceApartment * (1 - ((discountApartment * 1.00) / 100));

                System.out.printf("Apartment: %.2f lv.", priceApartment);
                System.out.println();
                System.out.printf("Studio: %.2f lv.", priceStudio);
                break;

            case "July":
            case "August":
                studio = 76;
                apartment = 77;
                priceStudio = days * studio;
                priceApartment = days * apartment;
                priceApartment = priceApartment * (1 - ((discountApartment * 1.00) / 100));

                System.out.printf("Apartment: %.2f lv.", priceApartment);
                System.out.println();
                System.out.printf("Studio: %.2f lv.", priceStudio);
                break;
        }
    }
}
