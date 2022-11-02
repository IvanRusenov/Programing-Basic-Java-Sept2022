package conditionalStatementsAdvancedMooreExercise;

import java.util.Scanner;

public class truckDriver {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String season = scan.nextLine();
        double kmPerMonth = Double.parseDouble(scan.nextLine());
        double fee = 0.0;
        double price = 0.0;
        double finalPrice = 0.0;

        if (season.equals("Spring") || (season.equals("Autumn"))){
            if (kmPerMonth <= 5000){
                fee = 0.75;
            }else if (kmPerMonth <=10000){
                fee = 0.95;
            }
        }else if (season.equals("Summer")){
            if (kmPerMonth <= 5000){
                fee = 0.90;
            }else if (kmPerMonth <=10000){
                fee = 1.10;
            }
        }else if (season.equals("Winter")){
            if (kmPerMonth <= 5000){
                fee = 1.05;
            }else if (kmPerMonth <=10000){
                fee = 1.25;
            }
        }
        if (kmPerMonth >10000 && kmPerMonth<=20000){
            fee = 1.45;
        }
        price = 4 * kmPerMonth * fee;// season = 4 months
        finalPrice  = price *0.90; //10% taxes

        System.out.printf("%.2f",finalPrice);
    }
}
