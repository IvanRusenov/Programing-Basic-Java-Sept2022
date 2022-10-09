package conditionalStatementsExercise;

import java.util.Scanner;

public class shopping {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        int vc = Integer.parseInt(scan.nextLine());
        int pro = Integer.parseInt(scan.nextLine());
        int ram = Integer.parseInt(scan.nextLine());

        int vcSum = vc * 250;
        double proSum = vcSum * 0.35;
        double ramSum = vcSum * 0.10;

        double totalSum = vcSum + proSum * pro + ramSum * ram;

        if ( vc > pro) {
            totalSum = totalSum - (totalSum * 0.15);
        }

        double diff = Math.abs( totalSum - budget );

        if (totalSum <= budget){
            System.out.printf("You have %.2f leva left!",diff);
        }else {
            System.out.printf("Not enough money! You need %.2f leva more!",diff);
        }

    }
}
