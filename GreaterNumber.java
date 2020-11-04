import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstN = Integer.parseInt(scan.nextLine());
        int secondN = Integer.parseInt(scan.nextLine());

        if (firstN > secondN) {
            System.out.println(firstN);
        } else {
            System.out.println(secondN);
        }
    }
}
