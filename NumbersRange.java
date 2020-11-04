import java.util.Scanner;

public class NumbersRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        if (num != 0) {
            if (num >= -100 && num <= 100) {
                System.out.println("Yes");
            } else System.out.println("No");
        }
        else System.out.println("No");
    }
}
