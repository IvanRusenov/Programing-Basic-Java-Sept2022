package programmingBasicsOnlineExam18and19July2020;

import java.util.Scanner;

public class addBags {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double baggageUp20 = Double.parseDouble(scan.nextLine());
        double kgBaggage = Double.parseDouble(scan.nextLine());
        int daysToTrip = Integer.parseInt(scan.nextLine());
        int countBaggage = Integer.parseInt(scan.nextLine());
        double price = 0.0;

        if (kgBaggage < 10){
            price = baggageUp20 * 0.20 * countBaggage;
        } else if (kgBaggage <= 20) {
            price = baggageUp20 * 0.50 * countBaggage;
        }else {
            price = baggageUp20 * countBaggage;
        }
        if (daysToTrip < 7){
            price = price * 1.40;
        } else if (daysToTrip <=30) {
            price = price * 1.15;
        }else {
            price = price * 1.10;
        }


        System.out.printf("The total price of bags is: %.2f lv.",price);
    }
}
