package programmingBasicsOnlinePreExam22and23October2022;

import java.util.Scanner;

public class finalCompetition03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int dancersCount = Integer.parseInt(scan.nextLine());
        double pointsCount = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();
        String place = scan.nextLine();
        double result = 0.0;
        if (place.equals("Bulgaria")){
            if (season.equals("summer")){
                result = pointsCount * dancersCount * 0.95;
            } else if (season.equals("winter")) {
                result = pointsCount * dancersCount * 0.92;
            }
        } else if (place.equals("Abroad")) {
            if (season.equals("summer")){
                result = 1.0 * dancersCount * pointsCount * 1.50 * 0.90;
            } else if (season.equals("winter")) {
                result = 1.0 * dancersCount * pointsCount * 1.50 * 0.85;
            }
        }
        double charity = result * 0.75;
        result -= charity;
        double dancersMoney =  result / dancersCount;

        System.out.printf("Charity - %.2f\n",charity);
        System.out.printf("Money per dancer - %.2f",dancersMoney);
    }
}
