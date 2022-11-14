package programmingBasicsOnlineExam9and10March2019;

import java.util.Scanner;

public class tennisRanklist {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tournirs = Integer.parseInt(scan.nextLine());
        int startPoints = Integer.parseInt(scan.nextLine());
        int countW = 0;
        int countF = 0;
        int countSF = 0;
        int points = startPoints;

        for (int i = 1; i <= tournirs ; i++) {
            String stage = scan.nextLine();
            //т – "W", "F" или "SF"
            if (stage.equals("W")){
                points += 2000;
                countW++;
            } else if (stage.equals("F")) {
                points += 1200;
                countF++;
            } else if (stage.equals("SF")) {
                points += 720;
                countSF++;
            }
        }

        System.out.printf("Final points: %d%n",points);
        double avgTour = Math.floor(1.0 * (points - startPoints) / tournirs);
        System.out.printf("Average points: %.0f%n",avgTour);
        double avg = (1.0* countW / tournirs) * 100;
        System.out.printf("%.2f%%",avg);
    }
}
