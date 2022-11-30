package programmingBasicsOnlinePreExam22and23October2022;

import java.util.Scanner;

public class christmasPreparation01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int paperRollsCount = Integer.parseInt(scan.nextLine());
        int clothRollCount = Integer.parseInt(scan.nextLine());
        double glueLiters = Double.parseDouble(scan.nextLine());
        int discount = Integer.parseInt(scan.nextLine());
        double price = paperRollsCount * 5.80 + clothRollCount * 7.20 + glueLiters * 1.20;
        double percentDiscount = discount / 100.00;
        double finalPrice = price - (price * percentDiscount);

        System.out.printf("%.3f",finalPrice);


    }
}
