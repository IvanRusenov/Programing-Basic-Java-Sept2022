package conditionalStatementsAdvancedMooreExercise;

import java.util.Scanner;

public class machTickets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget  = Double.parseDouble(scan.nextLine());
        String ticketType = scan.nextLine();
        int peoples = Integer.parseInt(scan.nextLine());
        double price = 0.0;
        double transport = 0.0;

        if (ticketType.equals("VIP")){
            price = 499.99;
        }else if (ticketType.equals("Normal")){
            price = 249.99;
        }

        if (peoples >= 1 && peoples <= 4){
            transport = budget  * 0.75;
        } else if (peoples >= 5 && peoples <= 9) {
            transport = budget * 0.60;
        } else if (peoples >= 10 && peoples<= 24) {
            transport = budget * 0.50;
        }else if (peoples >= 25 && peoples <= 49){
            transport = budget * 0.40;
        } else if (peoples >= 50) {
            transport = budget * 0.25;
        }
        double moneyLeft = (budget - transport) ;
        price =  peoples * price;

        double diff = Math.abs(moneyLeft - price);

        if (moneyLeft >= price){
            System.out.printf("Yes! You have %.2f leva left.",diff);
        }else {
            System.out.printf("Not enough money! You need %.2f leva.",diff);
        }
    }
}
