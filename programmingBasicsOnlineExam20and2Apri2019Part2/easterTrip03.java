package programmingBasicsOnlineExam20and2Apri2019Part2;

import java.util.Scanner;

public class easterTrip03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String destination = scan.nextLine();
        String period = scan.nextLine();
        int nightsCount = Integer.parseInt(scan.nextLine());
        int nightPrice = 0;
        if (destination.equals("France")){
            if (period.equals("21-23")){
                nightPrice = 30 ;
            } else if (period.equals("24-27")) {
                nightPrice = 35 ;
            } else if (period.equals("28-31")) {
                nightPrice = 40 ;
            }
        } else if (destination.equals("Italy")) {
            if (period.equals("21-23")){
                nightPrice = 28 ;
            } else if (period.equals("24-27")) {
                nightPrice = 32 ;
            } else if (period.equals("28-31")) {
                nightPrice = 39 ;
            }
        } else if (destination.equals("Germany")) {
            if (period.equals("21-23")){
                nightPrice = 32 ;
            } else if (period.equals("24-27")) {
                nightPrice = 37 ;
            } else if (period.equals("28-31")) {
                nightPrice = 43 ;
            }
        }
        double price = nightPrice * nightsCount;
        System.out.printf("Easter trip to %s : %.2f leva.",destination,price);

    }
}
