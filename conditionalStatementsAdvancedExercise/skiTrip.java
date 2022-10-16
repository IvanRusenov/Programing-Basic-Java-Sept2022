package conditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class skiTrip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int days = Integer.parseInt(scan.nextLine());
        String roomType = scan.nextLine();
        String evaluation = scan.nextLine();
        double price = 0.0;
        int nights = days-1;// нощувките са дните -1;

        switch (roomType){
            case "room for one person":
                price = 18.00 * nights;
                break;
            case "apartment":
                price = 25.00 * nights;
                if (nights <10){
                    price = price * 0.70;
                }else if (nights>10 && nights<15){
                    price = price * 0.65;
                }else if (nights > 15){
                    price = price*0.50;
                }
                break;
            case "president apartment":
                price = 35.00 * nights;
                if (nights <10){
                    price = price * 0.90;
                }else if (nights>10 && nights<15){
                    price = price * 0.85;
                }else if (nights > 15){
                    price = price*0.80;
                }
                break;
        }
        if (evaluation.equals("positive")){
            price = price * 1.25;
        } else if (evaluation.equals("negative")) {
            price = price * 0.90;
        }
        System.out.printf("%.2f",price);
    }
}
