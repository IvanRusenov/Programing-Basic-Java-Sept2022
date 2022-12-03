package programmingBasicsOnlineRegularExam29and30October2022;

import java.util.Scanner;

public class pastryShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String cakeType = scan.nextLine();
        int cakeCount = Integer.parseInt(scan.nextLine());
        int day = Integer.parseInt(scan.nextLine());
        double price = 0.00;
        if (cakeType.equals("Cake")) {
            if (day <= 15) {
                price = 24.00;
            } else {
                price = 28.70;
            }
        } else if (cakeType.equals("Souffle")) {
            if (day <= 15) {
                price = 6.66;
            } else {
                price = 9.80;
            }
        } else if (cakeType.equals("Baklava")) {
            if (day <= 15) {
                price = 12.60;
            } else {
                price = 16.98;
            }
        }
        double allPrice = cakeCount * price;
        if (day <= 22) {
            if (allPrice >= 100 && allPrice <= 200) {
                allPrice *= 0.85;
            } else if (allPrice > 200) {
                allPrice *= 0.75;
            }
        }
        if (day <= 15) {
            allPrice *= 0.90;
        }
        System.out.printf("%.2f", allPrice);
    }
}
