package programmingBasicsOnlineRegularExam29and30October2022;

import java.util.Scanner;

public class goldMine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int locationCount = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < locationCount; i++) {
            double expectedAvgYield = Double.parseDouble(scan.nextLine());
            int days = Integer.parseInt(scan.nextLine());
            int totalYeild = 0;
            for (int j = 0; j < days; j++) {
                int yield = Integer.parseInt(scan.nextLine());
                totalYeild += yield;
            }
            double avgYeald = 1.0 * totalYeild / days;
            double diff = Math.abs(expectedAvgYield - avgYeald);
            if (avgYeald >= expectedAvgYield) {
                System.out.printf("Good job! Average gold per day: %.2f.\n", avgYeald);
            } else {
                System.out.printf("You need %.2f gold.\n", diff);
            }
        }
    }
}
