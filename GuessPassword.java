import java.util.Scanner;

public class GuessPassword {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String password = "s3cr3t!P@ssw0rd";
        String entry = scan.nextLine();
        if (entry.equals(password)) {
            System.out.println("Welcome");
         } else {
            System.out.println("Wrong password!");
        }
    }
}
