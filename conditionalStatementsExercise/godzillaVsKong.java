package conditionalStatementsExercise;

import java.util.Scanner;

public class godzillaVsKong {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        int statist = Integer.parseInt(scan.nextLine());
        double outfit = Double.parseDouble(scan.nextLine());

        //double discount = 0.0;
        double decor = budget * 0.10;

        double outfitPrice = statist * outfit;



        if (statist > 150){
            outfitPrice = outfitPrice - (outfitPrice * 0.10);
        }

        double expenses = decor + outfitPrice;
        double diff = Math.abs(budget-expenses);

        if (budget < expenses){
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.",diff);
        }else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.",diff);
        }




    }
}
