import java.util.Scanner;

public class OnTimeExam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int examHour = Integer.parseInt(scan.nextLine());
        int examMinute = Integer.parseInt(scan.nextLine());
        int arrivalHour = Integer.parseInt(scan.nextLine());
        int arrivalMinute = Integer.parseInt(scan.nextLine());

        int totalExamTime = (examHour * 60) + examMinute;
        int totalArrivalTime = (arrivalHour * 60) + arrivalMinute;

        if (totalArrivalTime > totalExamTime) {
             System.out.println("Late");
             int timeLate = totalArrivalTime - totalExamTime;
             if (timeLate >= 60) {
                 int hourLate = timeLate / 60;
                 int minLate = timeLate % 60;
                 System.out.printf("%d:%02d hours after the start", hourLate, minLate);
             } else { System.out.printf("%d minutes after the start", totalArrivalTime - totalExamTime); }

         } else if (totalArrivalTime == totalExamTime || (totalExamTime - totalArrivalTime) <= 30) {
            System.out.println("On time");
            int onTime = totalExamTime - totalArrivalTime;
            if (onTime > 0 && onTime <= 30) {
                System.out.printf("%d minutes before the start", totalExamTime - totalArrivalTime);
            }
        } else {
            System.out.println("Early");

            int timeEarly = totalExamTime -totalArrivalTime;
            if (timeEarly >= 60) {
                int hourEarly = timeEarly / 60;
                int minEarly = timeEarly % 60;
                System.out.printf("%d:%02d hours before the start", hourEarly, minEarly);
            } else System.out.printf("%d minutes before the start", timeEarly);

        }
    }
}
