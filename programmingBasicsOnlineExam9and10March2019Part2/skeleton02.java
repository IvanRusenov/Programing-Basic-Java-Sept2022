package programmingBasicsOnlineExam9and10March2019Part2;

import java.util.Scanner;

public class skeleton02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int min = Integer.parseInt(scan.nextLine());
        int sec  = Integer.parseInt(scan.nextLine());
        double  length =Double.parseDouble(scan.nextLine());
        int timeFor100 = Integer.parseInt(scan.nextLine());

        int timeInSec = min * 60 + sec;
        double  delay =1.0* length / 120 * 2.5;
        double time = 1.0*  length / 100 * timeFor100 - delay;
        double diff = Math.abs(time-timeInSec);
        if (time <= timeInSec){
            System.out.println("Marin Bangiev won an Olympic quota!");
            System.out.printf("His time is %.3f.",time);
        }else {
            System.out.printf("No, Marin failed! He was %.3f second slower.",diff);
        }
    }
}
