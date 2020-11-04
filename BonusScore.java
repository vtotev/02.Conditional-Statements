import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Points = Integer.parseInt(scan.nextLine());
        double Bonus = 0;

        if (Points <= 100) {
            Bonus = 5;
        } else if (Points > 1000) {
            Bonus = Points * 0.1;
        } else Bonus = Points * 0.2;

        if (Points % 2 == 0) {
            Bonus = Bonus + 1;
        } else if (Points %10 == 5) {
            Bonus = Bonus + 2;
        }

        System.out.println(Bonus);
        System.out.println(Points + Bonus);
    }
}
