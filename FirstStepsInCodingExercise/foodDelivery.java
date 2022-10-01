package FirstStepsInCodingExercise;

import java.util.Scanner;

public class foodDelivery {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int chickenMenus = Integer.parseInt(scan.nextLine());
        int fishMenu = Integer.parseInt(scan.nextLine());
        int vegiMenu = Integer.parseInt(scan.nextLine());
        double price = chickenMenus*10.35 + fishMenu*12.4 + vegiMenu*8.15;
        double desertPrice = price * 0.20;
        double finalPrice = price + desertPrice + 2.5;

        System.out.println(finalPrice);

    }

}
