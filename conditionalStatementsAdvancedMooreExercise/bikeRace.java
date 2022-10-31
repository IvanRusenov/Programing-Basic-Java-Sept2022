package conditionalStatementsAdvancedMooreExercise;

import java.util.Scanner;

public class bikeRace {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int juniors = Integer.parseInt(scan.nextLine());
        int seniors = Integer.parseInt(scan.nextLine());
        String trace = scan.nextLine();
        double tax = 0.0;

        if (trace.equals("trail")){
            tax = juniors * 5.50 + seniors *7.00;
        }else if (trace.equals("cross-country")){
            tax = juniors * 8.00 + seniors * 9.50;
        }else if (trace.equals("downhill")){
            tax = juniors * 12.25 + seniors * 13.75;
        }else if (trace.equals("road")){
            tax = juniors * 20 + seniors * 21.50;
        }

        if ((juniors + seniors >= 50) && (trace.equals("cross-country"))){
            tax = tax * 0.75;
        }
        double finalPrice = tax * 0.95;
        System.out.printf("%.2f",finalPrice);
    }
}
