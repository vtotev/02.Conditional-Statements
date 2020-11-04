import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double number = Double.parseDouble(scan.nextLine());
        double conv = 0;
        String firstMetric = scan.nextLine();
        String secondMetric = scan.nextLine();
        switch (firstMetric){
            case "mm":
                switch (secondMetric) {
                    case "mm": conv = number;
                    break;
                    case "cm": conv = number/10;
                    break;
                    case "m": conv = number/1000;
                    break;
                }
                break;
            case "cm":
                switch (secondMetric) {
                    case "mm": conv = number*10;
                        break;
                    case "cm": conv = number;
                        break;
                    case "m": conv = number/100;
                        break;
                }
                break;
            case "m":
                switch (secondMetric) {
                    case "mm": conv = number*1000;
                        break;
                    case "cm": conv = number*100;
                        break;
                    case "m": conv = number;
                        break;
                }
                break;
//                System.out.println("Case");
//                break;
        }
        System.out.printf("%.3f", conv);
    }
}
