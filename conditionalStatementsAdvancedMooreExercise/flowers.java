package conditionalStatementsAdvancedMooreExercise;

import java.util.Scanner;

public class flowers {
    public static void main(String[] args) {
        Scanner scan = new Scanner((System.in));
        int chryCount = Integer.parseInt(scan.nextLine());
        int rosesCount  = Integer.parseInt(scan.nextLine());
        int tulipsCount  = Integer.parseInt(scan.nextLine());
        String season = scan.nextLine();
        String holiday = scan.nextLine();
        boolean isHoliday = false;
        double chryPrice = 0.00;
        double rosesPrice = 0.00;
        double tulipsPrice = 0.00;
        double price = 0.00;

        if (holiday.equals("Y")){
            isHoliday= true;
        }
        if (season.equals("Spring")||(season.equals("Summer"))){
            chryPrice = 2.00;
            rosesPrice = 4.10;
            tulipsPrice = 2.50;
        }else if ((season.equals("Autumn"))||(season.equals("Winter"))){
            chryPrice = 3.75;
            rosesPrice = 4.50;
            tulipsPrice = 4.15;
        }
        price = chryPrice * chryCount + rosesCount *
                rosesPrice + tulipsCount * tulipsPrice;

        if (isHoliday){
            price = price * 1.15;
        }

        if (tulipsCount > 7 && season.equals("Spring")){
            price = price * 0.95;
        } else if ((rosesCount >= 10) && (season.equals("Winter"))) {
            price = price * 0.90;
        }
        if (chryCount + rosesCount + tulipsCount > 20 ){
            price = price * 0.80;
        }
        price = price + 2.00;
        System.out.printf("%.2f",price);
    }
}
