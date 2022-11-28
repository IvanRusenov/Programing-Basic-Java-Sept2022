package programmingBasicsOnlineExam28and29March2020;

import java.util.Scanner;

public class foodForPets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int daysCount = Integer.parseInt(scan.nextLine());
        double totalFood = Double.parseDouble(scan.nextLine());
        int count = 0;
        double totalDogFood = 0.0;
        double totalCatFood = 0.0;
        double bonus = 0.0;
        int totalFoodEaten = 0;
        for (int i = 1; i <= daysCount ; i++) {
            int dogEatCount = Integer.parseInt(scan.nextLine());
            int catEatFood = Integer.parseInt(scan.nextLine());
            totalFoodEaten += dogEatCount + catEatFood;
            totalDogFood += dogEatCount;
            totalCatFood += catEatFood;
            if (i % 3 == 0 ){
                bonus += (dogEatCount + catEatFood )* 0.10;
            }
        }
        System.out.printf("Total eaten biscuits: %.0fgr.%n",bonus);
        double totatlPercent = totalFoodEaten / totalFood * 100;
        System.out.printf("%.2f%% of the food has been eaten.%n",totatlPercent);
        double dogPercent = totalDogFood / totalFoodEaten * 100;
        System.out.printf("%.2f%% eaten from the dog.%n",dogPercent);
        double catPercent = totalCatFood / totalFoodEaten * 100;
        System.out.printf("%.2f%% eaten from the cat.%n",catPercent);
    }
}
