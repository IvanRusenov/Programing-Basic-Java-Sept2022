package programmingBasicsOnlineExam20and21Apri2019;

import java.util.Scanner;

public class easterBakery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double kgFlourPrice = Double.parseDouble(scan.nextLine());
        double kgFlourCount = Double.parseDouble(scan.nextLine());
        double kgSugarCount = Double.parseDouble(scan.nextLine());
        double kgSugarPrice = kgFlourPrice * 0.75;
        int eggsCount = Integer.parseInt(scan.nextLine());
        double eggCrustPrice = kgFlourPrice * 1.10;
        int yeastPacksCount = Integer.parseInt(scan.nextLine());
        double yeastPrice = kgSugarPrice * 0.20;

        double price = kgFlourPrice * kgFlourCount + kgSugarPrice * kgSugarCount +
                eggCrustPrice * eggsCount + yeastPrice * yeastPacksCount;

        System.out.printf("%.2f",price);





    }
}
