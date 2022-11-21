package programmingBasicsOnlineExam18and19July2020;

import java.util.Scanner;

public class aluminumJoinery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int count = Integer.parseInt(scan.nextLine());
        String type =  scan.nextLine();
        String delivery = scan.nextLine();
        double price = 0.0;

        if (count < 10){
            System.out.println("Invalid order");
        }else{
            if (type.equals("90X130")){
                price = count * 110;
                if (count >= 60){
                    price = price * 0.92;
                } else if (count >= 30) {
                    price = price * 0.95;
                }
            } else if (type.equals("100X150")) {
                price = count * 140;
                if (count >= 80){
                    price = price * 0.90;
                } else if (count >= 40) {
                    price = price * 0.94;
                }
            }else if (type.equals("130X180")) {
                price = count * 190;
                if (count >= 50){
                    price = price * 0.88;
                } else if (count >= 20) {
                    price = price * 0.93;
                }
            }else if (type.equals("200X300")) {
                price = count * 250;
                if (count >= 50){
                    price = price * 0.86;
                } else if (count >= 25) {
                    price = price * 0.91;
                }
            }
            if (delivery.equals("With delivery")){
                price = price + 60;
            }
            if (count>=99){
                price = price * 0.96;
            }
            System.out.printf("%.2f BGN",price);
        }

    }
}
