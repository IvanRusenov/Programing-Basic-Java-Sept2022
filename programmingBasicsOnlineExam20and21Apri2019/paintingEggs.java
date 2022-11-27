package programmingBasicsOnlineExam20and21Apri2019;

import java.util.Scanner;

public class paintingEggs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



        String size = scan.nextLine();
        String color = scan.nextLine();
        int count = Integer.parseInt(scan.nextLine());
        double price = 0.0;
        //
//                      Червено (Red)	Зелено (Green)	Жълто (Yellow)
//        Големи (Large)	16 лв.	        12 лв.	        9 лв.
//        Средни (Medium)	13 лв.          9 лв.	        7 лв.
//        Малки (Small)	    9 лв.	        8 лв.	        5 лв.

        if (color.equals("Red")){
            if (size.equals("Large")){
                price = count * 16.00;
            } else if (size.equals("Medium")) {
                price = count * 13.00;
            }else if (size.equals("Small")) {
                price = count * 9.00;
            }
        } else if (color.equals("Green")) {
            if (size.equals("Large")){
                price = count * 12.00;
            } else if (size.equals("Medium")) {
                price = count * 9.00;
            }else if (size.equals("Small")) {
                price = count * 8.00;
            }
        }else if (color.equals("Yellow")) {
            if (size.equals("Large")){
                price = count * 9.00;
            } else if (size.equals("Medium")) {
                price = count * 7.00;
            }else if (size.equals("Small")) {
                price = count * 5.00;
            }
        }
        double finalPrice = price * 0.65;
        System.out.printf("%.2f leva.",finalPrice);

    }
}
