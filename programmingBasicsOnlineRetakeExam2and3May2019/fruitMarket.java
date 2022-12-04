package programmingBasicsOnlineRetakeExam2and3May2019;

import java.util.Scanner;

public class fruitMarket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double strawberryPrice = Double.parseDouble(scan.nextLine());
        double bananaKg = Double.parseDouble(scan.nextLine());
        double orangesKg = Double.parseDouble(scan.nextLine());
        double raspberriesKg = Double.parseDouble(scan.nextLine());
        double straeberiesKg = Double.parseDouble(scan.nextLine());

        double raspberriesPrice = strawberryPrice / 2;
        double orangPrice = raspberriesPrice * 0.60;
        double bananasPrice = raspberriesPrice * 0.20;

        double price = bananaKg * bananasPrice + orangesKg * orangPrice +
                raspberriesKg * raspberriesPrice + straeberiesKg * strawberryPrice;
        System.out.printf("%.2f%n",price);

    }
}
