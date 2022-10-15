package conditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class fishingBoat {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int budget = Integer.parseInt(scan.nextLine());
        String season = scan.nextLine();
        int mansCount = Integer.parseInt(scan.nextLine());
        double  rent = 0.0;
        double diff = 0.0;

        //: "Spring", "Summer", "Autumn", "Winter"
        if (season.equals("Spring")){
            rent = 3000;
        } else if (season.equals("Summer") || season.equals("Autumn")) {
            rent = 4200;
        } else if (season.equals("Winter")){
            rent = 2600;
        }
        if (mansCount <= 6){
            rent = rent * 0.90;
        } else if (mansCount <= 11) {
            rent = rent * 0.85;
        } else {
            rent = rent * 0.75;
        }
        if ((mansCount % 2 == 0) && !season.equals("Autumn")){
            rent = rent * 0.95;
        }
        diff = Math.abs(rent - budget);
        if (budget >= rent){
            System.out.printf("Yes! You have %.2f leva left.",diff);
        }else {
            System.out.printf("Not enough money! You need %.2f leva.",diff);
        }
    }
}
