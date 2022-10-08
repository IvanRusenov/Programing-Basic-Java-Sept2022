package conditionalStatementsExercise;

import java.util.Scanner;

public class worldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double record = Double.parseDouble(scan.nextLine());
        double meters = Double.parseDouble(scan.nextLine());
        double timeForOneMeter = Double.parseDouble(scan.nextLine());

        double totalMeters = meters * timeForOneMeter;
        double delay = Math.floor((meters / 15)) * 12.5;
        double totalTime = totalMeters + delay;
        double diff = Math.abs(record - totalTime);

        if (totalTime < record){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",totalTime);
        }else {
            System.out.printf("No, he failed! He was %.2f seconds slower.",diff);
        }


    }
}
