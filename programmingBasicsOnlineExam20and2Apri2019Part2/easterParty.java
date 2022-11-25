package programmingBasicsOnlineExam20and2Apri2019Part2;

import java.util.Scanner;

public class easterParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int guestCount = Integer.parseInt(scan.nextLine());
        double couvertPrice = Double.parseDouble(scan.nextLine());
        double budget  = Double.parseDouble(scan.nextLine());
        double cake = budget * 0.10;

        if (guestCount >= 10 && guestCount <= 15){
           couvertPrice = couvertPrice * 0.85;
        } else if (guestCount > 15 && guestCount <= 20) {
            couvertPrice = couvertPrice * 0.80;
        } else if(guestCount > 20) {
            couvertPrice = couvertPrice * 0.75;
        }
        double price = 1.0 * guestCount * couvertPrice + cake;
        double diff = Math.abs(budget - price);
        if (budget >= price){
            System.out.printf("It is party time! %.2f leva left.",diff);
        }else {
            System.out.printf("No party! %.2f leva needed.",diff);
        }
    }
}
