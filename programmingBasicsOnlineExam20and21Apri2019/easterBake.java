package programmingBasicsOnlineExam20and21Apri2019;

import java.util.Scanner;

public class easterBake {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int easterBakeCount = Integer.parseInt(scan.nextLine());
        int maxSugarUsed = Integer.MIN_VALUE;
        int maxFlourUsed = Integer.MIN_VALUE;

        int countTotalSugar = 0;
        int countTotalFlour = 0;

        for (int i = 0; i < easterBakeCount ; i++) {

            int sugar = Integer.parseInt(scan.nextLine());
            int flour = Integer.parseInt(scan.nextLine());
            if (maxSugarUsed < sugar){
                maxSugarUsed = sugar;
            }
            if (maxFlourUsed < flour){
                maxFlourUsed = flour;
            }
            countTotalSugar+=sugar;
            countTotalFlour+=flour;
        }
        System.out.printf("Sugar: %.0f%n",Math.ceil(1.0 * countTotalSugar / 950));
        System.out.printf("Flour: %.0f%n",Math.ceil(1.0 * countTotalFlour / 750));
        System.out.printf("Max used flour is %d grams, max used sugar is %d grams.",maxFlourUsed,maxSugarUsed);
    }
}
