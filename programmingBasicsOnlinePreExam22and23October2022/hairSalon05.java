package programmingBasicsOnlinePreExam22and23October2022;

import java.util.Scanner;

public class hairSalon05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int target = Integer.parseInt(scan.nextLine());
        String service = scan.nextLine();

        double totalPrice = 0.0;
        boolean isSucceed = false;
        while (!service.equals("closed")){
            String type = scan.nextLine();
            double price = 0.0;
            if (service.equals("haircut")){
                if (type.equals("mens")){
                    price = 15.00;
                } else if (type.equals("ladies")) {
                    price = 20.00;
                } else if (type.equals("kids")) {
                    price = 10.00;
                }
            } else if (service.equals("color")) {
                if (type.equals("touch up")){
                    price = 20.00;
                } else if (type.equals("full color")) {
                    price = 30.00;
                }
            }
            totalPrice +=price;
            if (totalPrice>=target){
                isSucceed = true;
                break;
            }

            service = scan.nextLine();
        }
        double diff = Math.abs(target - totalPrice);
        if(totalPrice >= target || isSucceed){
            System.out.println("You have reached your target for the day!");
        }else {
            System.out.printf("Target not reached! You need %.0flv. more.\n",diff);
        }

        System.out.printf("Earned money: %.0flv.",totalPrice);

    }
}
