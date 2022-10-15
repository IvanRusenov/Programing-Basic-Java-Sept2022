package conditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class journey {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();
        String sleepIn = "";
        String destination = "";

        if (budget <= 100){
            destination ="Bulgaria";
            if (season.equals("summer")){
                sleepIn = "Camp";
                budget = budget * 0.30;
            }else if (season.equals("winter")) {
                budget = budget * 0.70;
                sleepIn ="Hotel";
            }
        }else if (budget <=1000){
            destination = "Balkans";
            if (season.equals("summer")){
                budget = budget * 0.40;
                sleepIn = "Camp";
            }else if (season.equals("winter")) {
                budget = budget * 0.80;
                sleepIn ="Hotel";
            }
        }else if (budget > 1000){
            destination = "Europe";
            budget = budget * 0.90;
            sleepIn ="Hotel";
        }
        System.out.printf("Somewhere in %s%n",destination);
        System.out.printf("%s - %.2f%n",sleepIn, budget);


    }
}
