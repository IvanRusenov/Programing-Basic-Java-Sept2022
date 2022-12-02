package programmingBasicsOnlineRegularExam29and30October2022;

import java.util.Scanner;

public class aNDProcessors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int processorsCount = Integer.parseInt(scan.nextLine());
        int employersCount = Integer.parseInt(scan.nextLine());
        int workingDays = Integer.parseInt(scan.nextLine());
        int totalHours = employersCount * workingDays * 8;
        double madeProcessors = Math.floor(totalHours / 3.00);
        double diff = Math.abs(processorsCount - madeProcessors);
        if (madeProcessors >= processorsCount) {
            System.out.printf("Profit: -> %.2f BGN", diff * 110.10);
        } else {
            System.out.printf("Losses: -> %.2f BGN", diff * 110.10);
        }
    }
}
