package programmingBasicsOnlineExam15and16June2019;

import java.util.Scanner;

public class movieDestination {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        String destination = scan.nextLine();
        String season = scan.nextLine();
        int days = Integer.parseInt(scan.nextLine());
        double price = 0.0;

        if (destination.equals("Dubai")){
            if (season.equals("Winter")){
                price = days * 45000 ;
            } else if (season.equals("Summer")) {
                price = days * 40000 ;
            }
            price = price * 0.70;

        }else if (destination.equals("Sofia")){
            if (season.equals("Winter")){
                price = days * 17000;
            } else if (season.equals("Summer")) {
                price = days * 12500;
            }
            price = price * 1.25;

        }else if (destination.equals("London")){
            if (season.equals("Winter")){
                price = days * 24000;
            } else if (season.equals("Summer")) {
                price = days * 20250;
            }
        }
        double diff = Math.abs(budget-price);
        if (budget>=price){
            System.out.printf("The budget for the movie is enough! We have %.2f leva left!",diff);
        }else{
            System.out.printf("The director needs %.2f leva more!",diff);
        }
    }
}
