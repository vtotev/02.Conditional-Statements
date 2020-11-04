import java.util.Scanner;

public class SpeedINfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double Speed = Double.parseDouble(scan.nextLine());

        if (Speed <= 10) {
            System.out.println("slow");
        } else if (Speed <=50) {
            System.out.println("average");
        }
        else if (Speed <=150) {
        System.out.println("fast");
        }
        else if (Speed <=1000) {
            System.out.println("ultra fast");
        }
        else System.out.println("extremely fast");
        }
}
