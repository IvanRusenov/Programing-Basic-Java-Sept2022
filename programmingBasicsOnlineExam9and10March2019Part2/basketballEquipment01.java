package programmingBasicsOnlineExam9and10March2019Part2;

import java.util.Scanner;

public class basketballEquipment01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tax = Integer.parseInt(scan.nextLine());
        double shoesPrice = tax * 0.60;
        double outfitPrice = shoesPrice * 0.80;
        double ballPrice = outfitPrice / 4;
        double accPrice = ballPrice / 5;
        double price = tax + shoesPrice + outfitPrice + ballPrice + accPrice;
        System.out.printf("%.2f",price);
    }
}
