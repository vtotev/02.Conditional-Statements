import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double income = Double.parseDouble(scan.nextLine());
        double avgSucc = Double.parseDouble(scan.nextLine());
        double minimalSalary = Double.parseDouble(scan.nextLine());

        double socialScholarship = minimalSalary * 0.35;
        double excScholarship = avgSucc * 25;

            if (income <= minimalSalary) {

                if (avgSucc > 4.5 && avgSucc < 5.5) {
                    System.out.printf("You get a Social scholarship %.0f BGN", Math.floor(socialScholarship));
                } else if (avgSucc >= 5.5) {
                    if (socialScholarship <= excScholarship) {
                        System.out.printf("You get a scholarship for excellent results %.0f BGN", Math.floor(excScholarship));
                    } else System.out.printf("You get a Social scholarship %.0f BGN", Math.floor(socialScholarship));
                } else System.out.println("You cannot get a scholarship!");

            } else
                if (avgSucc >= 5.5) {
                    System.out.printf("You get a scholarship for excellent results %.0f BGN", Math.floor(excScholarship));
                }else System.out.println("You cannot get a scholarship!");


//        if (income > minimalSalary && avgSucc < 5.5) {
//            System.out.println("You cannot get a scholarship!");
//        } else
//            if (income < minimalSalary && (avgSucc >= 4.5 && avgSucc < 5.5))
//        {
//            System.out.printf("You get a Social scholarship %.0f BGN", Math.floor(socialScholarship));
//        } else if (avgSucc >= 5.5)
//        {
//            if (socialScholarship <= excScholarship) {
//                System.out.printf("You get a scholarship for excellent results %.0f BGN", Math.floor(excScholarship));
//            } else             System.out.printf("You get a Social scholarship %.0f BGN", Math.floor(socialScholarship));
//        } else System.out.println("You cannot get a scholarship!");
    }
}
