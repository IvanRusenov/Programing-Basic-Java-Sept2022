package programmingBasicsOnlineExam20and21Apri2019;

import java.util.Scanner;

public class easterDecoration {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int countClients = Integer.parseInt(scan.nextLine());

        double allClientsPrice = 0.0;
        for (int i = 0; i < countClients ; i++) {
            String input = scan.nextLine();
            double price = 0.0;
            int count = 0;
            while (!input.equals("Finish")){
                count++;
                if (input.equals("basket")){
                    price += 1.50;
                } else if (input.equals("wreath")) {
                    price += 3.80;
                } else if (input.equals("chocolate bunny")) {
                    price += 7.00;
                }

                input = scan.nextLine();
            }
            if ( count % 2 == 0){
                price = price * 0.80;
            }

            allClientsPrice += price;
            System.out.printf("You purchased %d items for %.2f leva.%n",count,price);

        }
        double avgBill = allClientsPrice / countClients;
        System.out.printf("Average bill per client is: %.2f leva.%n",avgBill);

    }
}
