package programmingBasicsOnlineRetakeExam2and3May2019;

import java.util.Scanner;

public class touristShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        double price = 0.0;
        int count = 0;
        boolean isExpensive = false;
        String productName =scan.nextLine();

        while (!productName.equals("Stop")){
            double productPrice = Double.parseDouble(scan.nextLine());
            count++;
            if (count % 3 == 0){
                productPrice = productPrice / 2;
            }
            price += productPrice;
            if (price > budget){
                isExpensive = true;
                break;
            }
            productName =scan.nextLine();

        }
        double diff = Math.abs(budget - price);
        if (isExpensive){
            System.out.println("You don't have enough money!");
            System.out.printf("You need %.2f leva!",diff);
        }else {
            System.out.printf("You bought %d products for %.2f leva.",count,price);
        }
    }
}
