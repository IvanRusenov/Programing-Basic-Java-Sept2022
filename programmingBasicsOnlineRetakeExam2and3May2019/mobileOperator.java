package programmingBasicsOnlineRetakeExam2and3May2019;

import java.util.Scanner;

public class mobileOperator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String term = scan.nextLine();
        String type = scan.nextLine();
        String internet = scan.nextLine();
        int months = Integer.parseInt(scan.nextLine());
        double price = 0.0;


        if (type.equals("Small")){
            if (term.equals("one")){
                if (internet.equals("yes")){
                    price = months * (9.98 + 5.50);
                }else {
                    price = months * 9.98;
                }

            }else if (term.equals("two")){
                if (internet.equals("yes")){
                    price = months * (8.58 + 5.50);
                }else {
                    price = months * 8.58;
                }
                price = price * 0.9625;
            }
            
        } else if (type.equals("Middle")) {
            if (term.equals("one")){
                if (internet.equals("yes")){
                    price = months * (18.99 + 4.35);
                }else {
                    price = months * 18.99;
                }

            }else if (term.equals("two")){
                if (internet.equals("yes")){
                    price = months * (17.09 + 4.35);
                }else {
                    price = months * 17.09;
                }
                price = price * 0.9625;
            }
        }else if (type.equals("Large")) {
            if (term.equals("one")){
                if (internet.equals("yes")){
                    price = months * (25.98 + 4.35);
                }else {
                    price = months * 25.98;
                }

            }else if (term.equals("two")){
                if (internet.equals("yes")){
                    price = months * (23.59 + 4.35);
                }else {
                    price = months * 23.59;
                }
                price = price * 0.9625;
            }
        }else if (type.equals("ExtraLarge")) {
            if (term.equals("one")){
                if (internet.equals("yes")){
                    price = months * (35.99 + 3.85);
                }else {
                    price = months * 35.99;
                }

            }else if (term.equals("two")){
                if (internet.equals("yes")){
                    price = months * (31.79 + 3.85);
                }else {
                    price = months * 31.79;
                }
                price = price * 0.9625;
            }
        }

        System.out.printf("%.2f lv.",price);
    }
}
