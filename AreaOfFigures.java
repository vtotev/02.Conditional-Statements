import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String figType = scan.nextLine();
        double area = 0;
        if (figType.equals("square")) {
            double side = Double.parseDouble(scan.nextLine());
            area = side*side;
            System.out.println(area);
        } else if (figType.equals("rectangle")) {
            double sideA = Double.parseDouble(scan.nextLine());
            double sideB = Double.parseDouble(scan.nextLine());
            area = sideA*sideB;
            System.out.println(area);
        } else if (figType.equals("circle")) {
            double rad = Double.parseDouble(scan.nextLine());
            area = ((rad*rad) * Math.PI);
            System.out.println(area);
        } else if (figType.equals("triangle")) {
            double sideA = Double.parseDouble(scan.nextLine());
            double sideB = Double.parseDouble(scan.nextLine());
            area = (sideA*sideB)/2;
            System.out.println(area);
        }
    }
}
