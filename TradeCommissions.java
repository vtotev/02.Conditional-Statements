import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String city = scan.nextLine();
        double sales = Double.parseDouble(scan.nextLine());
        double comission = 0;
        switch (city) {
            case "Sofia":
                if (sales >=0 && sales <= 500) {
                    comission = 5;
                } else  if (sales >500 && sales <= 1000) {
                    comission = 7;
                } else  if (sales > 1000 && sales <= 10000) {
                    comission = 8;
                } else  if (sales >= 10000) {
                    comission = 12;
                } else System.out.println("error");
                break;

            case "Varna":
                if (sales >=0 && sales <= 500) {
                    comission = 4.5;
                } else  if (sales >500 && sales <= 1000) {
                    comission = 7.5;
                } else  if (sales > 1000 && sales <= 10000) {
                    comission = 10;
                } else  if (sales >= 10000) {
                    comission = 13;
                } else System.out.println("error");
                break;

            case "Plovdiv":
                if (sales >=0 && sales <= 500) {
                    comission = 5.5;
                } else  if (sales >500 && sales <= 1000) {
                    comission = 8;
                } else  if (sales > 1000 && sales <= 10000) {
                    comission = 12;
                } else  if (sales >= 10000) {
                    comission = 14.5;
                } else {System.out.println("error"); }
                break;
            default:
                System.out.println("error");
                break;
        }
        double commisionSum = sales * (comission / 100);
        if (sales >= 0) {
            switch (city) {
                case "Sofia":
                case "Varna":
                case "Plovdiv":
                    System.out.printf("%.2f", commisionSum);
                    break;
            }
        }
    }
}
