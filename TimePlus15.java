import java.util.Scanner;

public class TimePlus15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hour = Integer.parseInt(scan.nextLine());
        int min = Integer.parseInt(scan.nextLine());

        if (hour >= 23 && min >=45) {
            hour = 0;
            min = (min + 15) - 60;
        } else if ((hour >=0 && hour < 23) && (min >= 45)){
            hour = hour + 1;
            min = (min + 15)-60;
        } else min = min + 15;

        if (min < 9) {
            System.out.println(hour + ":0" + min);
        } else System.out.printf("%d:%2d", hour, min);
    }
}
