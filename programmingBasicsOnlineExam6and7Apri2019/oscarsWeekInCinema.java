package programmingBasicsOnlineExam6and7Apri2019;

import java.util.Scanner;

public class oscarsWeekInCinema {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        String type = scan.nextLine();
        int ticketsCount = Integer.parseInt(scan.nextLine());
        double price = 0.0;

        if (name.equals("A Star Is Born")) {
            if (type.equals("normal")) {
                price = ticketsCount * 7.50;
            } else if (type.equals("luxury")) {
                price = ticketsCount * 10.50;
            } else if (type.equals("ultra luxury")) {
                price = ticketsCount * 13.50;
            }
        } else if (name.equals("Bohemian Rhapsody")) {
            if (type.equals("normal")) {
                price = ticketsCount * 7.35;
            } else if (type.equals("luxury")) {
                price = ticketsCount * 9.45;
            } else if (type.equals("ultra luxury")) {
                price = ticketsCount * 12.75;
            }
        } else if (name.equals("Green Book")) {
            if (type.equals("normal")) {
                price = ticketsCount * 8.15;
            } else if (type.equals("luxury")) {
                price = ticketsCount * 10.25;
            } else if (type.equals("ultra luxury")) {
                price = ticketsCount * 13.25;
            }
        } else if (name.equals("The Favourite")) {
            if (type.equals("normal")) {
                price = ticketsCount * 8.75;
            } else if (type.equals("luxury")) {
                price = ticketsCount * 11.55;
            } else if (type.equals("ultra luxury")) {
                price = ticketsCount * 13.95;
            }
        }
        System.out.printf("%s -> %.2f lv.",name,price);
    }
}


