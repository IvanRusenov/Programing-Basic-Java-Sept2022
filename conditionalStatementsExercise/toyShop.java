package conditionalStatementsExercise;

import java.util.Scanner;

public class toyShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double tripPrice = Double.parseDouble(scan.nextLine());
        int puzzels = Integer.parseInt(scan.nextLine());
        int dolls = Integer.parseInt(scan.nextLine());
        int bears = Integer.parseInt(scan.nextLine());
        int minions = Integer.parseInt(scan.nextLine());
        int trucks = Integer.parseInt(scan.nextLine());

        double sumAllToys = puzzels * 2.6 + dolls * 3.0 + bears * 4.10 + minions * 8.20 + trucks * 2.0;
        int toysCount = puzzels + dolls + bears + minions + trucks;

        if (toysCount >= 50) {
            sumAllToys = sumAllToys - (sumAllToys * 0.25);
        }

        double rent = sumAllToys * 0.10;
        double totalSum = sumAllToys - rent;
        double diff = Math.abs(totalSum-tripPrice);


        if (totalSum >= tripPrice){
            System.out.printf("Yes! %.2f lv left.",diff);
        }else {
            System.out.printf("Not enough money! %.2f lv needed.",diff);
        }







    }
}
