package programmingBasicsOnlineExam28and29March2020;

import java.util.Scanner;

public class fitnessCard {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double  budget = Double.parseDouble(scan.nextLine());
        String gender = scan.nextLine();
        int age = Integer.parseInt(scan.nextLine());
        String typeSport = scan.nextLine();
        double cardPrice = 0.0;
        if (gender.equals("m")){
            if (typeSport.equals("Gym")){
                cardPrice = 42.00;
            } else if (typeSport.equals("Boxing")) {
                cardPrice = 41.00;
            } else if (typeSport.equals("Yoga")) {
                cardPrice = 45.00;
            } else if (typeSport.equals("Zumba")) {
                cardPrice = 34.00;
            } else if (typeSport.equals("Dances")) {
                cardPrice = 51.00;
            } else if (typeSport.equals("Pilates")) {
                cardPrice = 39.00;
            }
        } else if (gender.equals("f")) {
            if (typeSport.equals("Gym")){
                cardPrice = 35.00;
            } else if (typeSport.equals("Boxing")) {
                cardPrice = 37.00;
            } else if (typeSport.equals("Yoga")) {
                cardPrice = 42.00;
            } else if (typeSport.equals("Zumba")) {
                cardPrice = 31.00;
            } else if (typeSport.equals("Dances")) {
                cardPrice = 53.00;
            } else if (typeSport.equals("Pilates")) {
                cardPrice = 37.00;
            }
        }
        if (age <= 19){
            cardPrice = cardPrice * 0.80;
        }
        double diff = Math.abs(budget-cardPrice);
        if(budget >= cardPrice){
            System.out.printf("You purchased a 1 month pass for %s.",typeSport);
        }else {
            System.out.printf("You don't have enough money! You need $%.2f more.",diff);

        }
    }
}
