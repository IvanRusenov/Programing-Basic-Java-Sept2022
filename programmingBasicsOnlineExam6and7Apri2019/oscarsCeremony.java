package programmingBasicsOnlineExam6and7Apri2019;

import java.util.Scanner;

public class oscarsCeremony {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int rent = Integer.parseInt(scan.nextLine());
        double  statuets  = rent * 0.70;
        double cathering = statuets * 0.85;
        double sound = cathering / 2;
        double expences = rent + statuets + cathering + sound;
        System.out.printf("%.2f",expences);
    }
}
