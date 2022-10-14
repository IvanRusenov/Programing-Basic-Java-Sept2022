package conditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class newHouse {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String flowersType = scan.nextLine();
        int flowersCount = Integer.parseInt(scan.nextLine());
        int budget = Integer.parseInt(scan.nextLine());
        double price = 0.00;

        switch (flowersType){
            case "Roses":
                price = flowersCount * 5.00;
                if (flowersCount > 80){
                    price = price  - (price * 0.10);
                }
                break;
            case "Dahlias":
                price = flowersCount * 3.80;
                if (flowersCount > 90){
                    price = price  - (price * 0.15);
                }
                break;
            case "Tulips":
                price = flowersCount * 2.80;
                if (flowersCount > 80){
                    price = price  - (price * 0.15);
                }
                break;
            case "Narcissus":
                price = flowersCount * 3.00;
                if (flowersCount < 120){
                    price = price * 1.15;
                }
                break;
            case "Gladiolus":
                price = flowersCount * 2.50;
                if (flowersCount < 80){
                    price = price * 1.20;
                }
                break;
        }

        double diff = Math.abs(budget - price);

        if (budget >= price){
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",flowersCount,flowersType,diff);
        }else{
            System.out.printf("Not enough money, you need %.2f leva more.",diff);
        }

    }
}
