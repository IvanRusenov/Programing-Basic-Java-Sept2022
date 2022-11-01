package conditionalStatementsAdvancedMooreExercise;

import java.util.Scanner;

public class vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();
        String place = "";
        String destination ="";

        if (budget <= 1000){
            place ="Camp";
            if (season.equals("Summer")){
                budget = budget * 0.65;
                destination = "Alaska";
            }if (season.equals("Winter")){
                budget = budget * 0.45;
                destination = "Morocco";
            }
        } else if (budget<=3000) {
            place ="Hut";
            if (season.equals("Summer")){
                budget = budget * 0.80;
                destination = "Alaska";
            }if (season.equals("Winter")){
                budget = budget * 0.60;
                destination = "Morocco";
            }
        }else if (budget > 3000) {
            place = "Hotel";
            if (season.equals("Summer")) {
                budget = budget * 0.90;
                destination = "Alaska";
            }
            if (season.equals("Winter")) {
                budget = budget * 0.90;
                destination = "Morocco";
            }
        }
        System.out.printf("%s - %s - %.2f",destination,place,budget);
    }
}
