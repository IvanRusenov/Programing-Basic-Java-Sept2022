package programmingBasicsOnlineExam9and10March2019Part2;

import java.util.Scanner;

public class worldSnookerChampionship03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String stage = scan.nextLine();
        String type = scan.nextLine();
        int ticketsCount = Integer.parseInt(scan.nextLine());
        String picture = scan.nextLine();
        double ticketPrice = 0.0;

        if (stage.equals("Quarter final")) {
            if (type.equals("Standard")) {
                ticketPrice = 55.50;
            } else if (type.equals("Premium")) {
                ticketPrice = 105.20;
            } else if (type.equals("VIP")) {
                ticketPrice = 118.90;
            }

        } else if (stage.equals("Semi final")) {
            if (type.equals("Standard")) {
                ticketPrice = 78.88;
            } else if (type.equals("Premium")) {
                ticketPrice = 125.22;
            } else if (type.equals("VIP")) {
                ticketPrice = 300.40;
            }
        } else if (stage.equals("Final")) {
            if (type.equals("Standard")) {
                ticketPrice = 110.10;
            } else if (type.equals("Premium")) {
                ticketPrice = 160.66;
            } else if (type.equals("VIP")) {
                ticketPrice = 400.00;
            }
        }

        double price = ticketsCount * ticketPrice;
        double sumForPictures = ticketsCount * 40.00;
        if (price > 4000) {
            price *= 0.75;
        } else if (price > 2500) {
            price *= 0.90;
            if (picture.equals("Y")) {
                price += sumForPictures;
            }
        } else {
            if (picture.equals("Y")) {
                price += sumForPictures;
            }
        }

        System.out.printf("%.2f", price);

    }
}
