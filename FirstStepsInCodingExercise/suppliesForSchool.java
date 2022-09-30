package FirstStepsInCodingExercise;

import java.util.Scanner;

public class suppliesForSchool {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int pensCount = Integer.parseInt(scan.nextLine());
        int markersCount = Integer.parseInt(scan.nextLine());
        int detergent = Integer.parseInt(scan.nextLine());
        int discount = Integer.parseInt(scan.nextLine());

        double  pensPrice = pensCount * 5.8;
        double markPrice = markersCount * 7.2;
        double  detPrice = detergent * 1.2;
        double price  = pensPrice + markPrice + detPrice;
       // double discountPercent = discount / 100;
        double finalPrice = price - (price * discount / 100);

        System.out.println(finalPrice);


    }
}
