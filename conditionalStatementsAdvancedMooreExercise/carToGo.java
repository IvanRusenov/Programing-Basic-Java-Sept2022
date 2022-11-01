package conditionalStatementsAdvancedMooreExercise;

import java.util.Scanner;

public class carToGo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Double budget = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();
        String clas = "";
        String type = "";

        if (budget <= 100){
            clas = "Economy class";
            if (season.equals("Summer")){
                type = "Cabrio";
                budget = budget * 0.35;
            } else if (season.equals("Winter")) {
                type = "Jeep";
                budget = budget * 0.65;
            }
        } else if (budget <= 500){
            clas = "Compact class";
            if (season.equals("Summer")){
                type = "Cabrio";
                budget = budget * 0.45;
            } else if (season.equals("Winter")) {
                type = "Jeep";
                budget = budget * 0.80;
            }
        } else if (budget >500) {
            clas = "Luxury class";
            type = "Jeep";
            budget = budget * 0.90;
        }
        System.out.println(clas);
        System.out.printf("%s - %.2f",type,budget);
    }
}
