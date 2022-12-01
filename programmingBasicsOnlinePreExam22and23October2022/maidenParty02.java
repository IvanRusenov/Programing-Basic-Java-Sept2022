package programmingBasicsOnlinePreExam22and23October2022;

import java.util.Scanner;

public class maidenParty02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double price = Double.parseDouble(scan.nextLine());
        int loveMessages  = Integer.parseInt(scan.nextLine());
        int roses = Integer.parseInt(scan.nextLine());
        int keyHolders = Integer.parseInt(scan.nextLine());
        int caricatures = Integer.parseInt(scan.nextLine());
        int lucks = Integer.parseInt(scan.nextLine());
        double profit = loveMessages * 0.60 + roses * 7.20 +
                keyHolders * 3.60 +
                caricatures *18.20 +
                lucks * 22.00;
        int itemsCount = loveMessages + roses + keyHolders + caricatures + lucks;
        if (itemsCount >= 25 ){
            profit *= 0.65;
        }
        double hosting = profit * 0.10;
        double finalProfit = profit - hosting;
        double diff = Math.abs(price - finalProfit);
       if (profit >= price){
           System.out.printf("Yes! %.2f lv left.",diff);
       }else {
           System.out.printf("Not enough money! %.2f lv needed.",diff);
       }


    }
}
