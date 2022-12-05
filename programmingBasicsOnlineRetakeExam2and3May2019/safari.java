package programmingBasicsOnlineRetakeExam2and3May2019;

import java.util.Scanner;

public class safari {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        double liters = Double.parseDouble(scan.nextLine());
        String day = scan.nextLine();
        double fuelPrice = liters * 2.10;
        double price = fuelPrice + 100;


        if (day.equals("Saturday")){
            price = price * 0.90;
        } else if (day.equals("Sunday")) {
            price = price * 0.80;
        }

        double diff = Math.abs(budget - price);
        if (budget>= price){
            System.out.printf("Safari time! Money left: %.2f lv.",diff);
        }else {
            System.out.printf("Not enough money! Money needed: %.2f lv.",diff);
        }
    }
}
