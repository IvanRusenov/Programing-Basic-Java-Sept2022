package programmingBasicsOnlineExam20and2Apri2019Part2;

import java.util.Scanner;

public class easterBake05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int breadsCount = Integer.parseInt(scan.nextLine());
        int totalSugar = 0;
        int totalFluor = 0;
        int maxSugar = Integer.MIN_VALUE;
        int maxFluor = Integer.MIN_VALUE;
        for (int i = 0; i < breadsCount; i++) {
            int sugar = Integer.parseInt(scan.nextLine());
            if (sugar > maxSugar){
                maxSugar = sugar;
            }
            totalSugar+=sugar;
            int flour = Integer.parseInt(scan.nextLine());
            if (flour > maxFluor){
                maxFluor = flour;
            }
            totalFluor += flour;

        }
        double packetsSugar = Math.ceil( 1.0 * totalSugar / 950);
        double packetFlour =  Math.ceil( 1.0 * totalFluor / 750);

        System.out.printf("Sugar: %.0f\n",packetsSugar);
        System.out.printf("Flour: %.0f\n",packetFlour);
        System.out.printf("Max used flour is %d grams, max used sugar is %d grams.\n",maxFluor,maxSugar);
    }
}
