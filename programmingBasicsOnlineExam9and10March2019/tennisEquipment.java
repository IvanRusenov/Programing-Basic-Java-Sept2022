package programmingBasicsOnlineExam9and10March2019;

import java.util.Scanner;

public class tennisEquipment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double rocketPrice = Double.parseDouble(scan.nextLine());
        int rocketsCount = Integer.parseInt(scan.nextLine());
        int snickersCount = Integer.parseInt(scan.nextLine());
        double snickersPrice = snickersCount * rocketPrice / 6;
        double rocketFinalPrice = rocketPrice * rocketsCount;
        double totalPrice  = snickersPrice + rocketFinalPrice;
       double otherEquipment = totalPrice * 0.20;
       totalPrice += otherEquipment;
        double jokoPrice = Math.floor(totalPrice / 8) ;
        double sponsorPrice = Math.ceil(totalPrice * 7 / 8);
        System.out.printf("Price to be paid by Djokovic %.0f%n",jokoPrice);
        System.out.printf("Price to be paid by sponsors %.0f%n",sponsorPrice);

    }
}
