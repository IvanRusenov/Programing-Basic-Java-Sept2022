package programmingBasicsOnlineExam6and7Apri2019;

import java.util.Scanner;

public class godzillaVsKong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        int scCount = Integer.parseInt(scan.nextLine());
        double outfit = Double.parseDouble(scan.nextLine());

        double  decor = budget * 0.10;
        if (scCount>150){
            outfit = outfit * 0.90;
        }
        double outfitPrice = scCount * outfit;
        double total = decor + outfitPrice ;
        double diff = Math.abs(budget - total);
        if (total <= budget){
            System.out.printf("Action!%n");
            System.out.printf("Wingard starts filming with %.2f leva left.",diff);
        }else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.",diff);
        }
    }
}
