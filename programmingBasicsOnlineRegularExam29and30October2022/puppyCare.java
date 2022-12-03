package programmingBasicsOnlineRegularExam29and30October2022;

import java.util.Scanner;

public class puppyCare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dogFoodKg = Integer.parseInt(scan.nextLine());
        int dogFoodGr = dogFoodKg * 1000;
        String eatenFoodGr = scan.nextLine();
        int totalFoodEaten = 0;
        while (!eatenFoodGr.equals("Adopted")) {
            int grams = Integer.parseInt(eatenFoodGr);
            totalFoodEaten += grams;
            eatenFoodGr = scan.nextLine();
        }
        int diff = Math.abs(totalFoodEaten - dogFoodGr);
        if (totalFoodEaten <= dogFoodGr) {
            System.out.printf("Food is enough! Leftovers: %d grams.", diff);
        } else {
            System.out.printf("Food is not enough. You need %d grams more.", diff);
        }
    }
}
