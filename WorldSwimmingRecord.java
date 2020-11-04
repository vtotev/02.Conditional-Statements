import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double recordSecs = Double.parseDouble(scan.nextLine());
        double lengthM = Double.parseDouble(scan.nextLine());
        double time1m = Double.parseDouble(scan.nextLine());

        double timeToSwim = lengthM * time1m;
        double timeSlowed = Math.floor(lengthM / 15) * 12.5;
        double totalTime = timeToSwim + timeSlowed;
        if (totalTime < recordSecs) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", (totalTime - recordSecs));
        }
    }
}
