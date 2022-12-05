package programmingBasicsOnlineRetakeExam2and3May2019;

import java.util.Scanner;

public class vetParking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int days = Integer.parseInt(scan.nextLine());
        int hours = Integer.parseInt(scan.nextLine());
        double price = 0.0;
        double totalPrice = 0.0;

        for (int i = 1; i <= days; i++) {
            for (int j = 1; j <=hours ; j++) {
                if (i %2 ==0){
                    if (j%2!=0){
                        price += 2.50;
                    }else{
                        price += 1;
                    }
                }else {
                    if (j%2 == 0){
                        price+=1.25;
                    }else {
                        price+=1;
                    }
                }
            }
            System.out.printf("Day: %d - %.2f leva%n",i,price);
            totalPrice += price;
            price = 0.0;
        }
        System.out.printf("Total: %.2f leva",totalPrice);



    }
}
