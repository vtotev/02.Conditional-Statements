import java.util.Scanner;
import java.util.ServiceConfigurationError;

public class InvalidNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numb = Integer.parseInt(scan.nextLine());

        if (numb < 100 && numb != 0) {
            System.out.println("invalid");
        } else if (numb > 200 && numb != 0) {
            System.out.println("invalid");
        }
    }
}
