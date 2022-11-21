package programmingBasicsOnlineExam18and19July2020;

import java.util.Scanner;

public class agencyProfit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        int ticketCounter = Integer.parseInt(scan.nextLine());
        int kidsCounter = Integer.parseInt(scan.nextLine());
        double ticketPrice = Double.parseDouble(scan.nextLine());
        double tax = Double.parseDouble(scan.nextLine());

        double kidsTicket = ticketPrice * 0.30 + tax;
        double adultTicket = ticketPrice + tax;

        double totalPrice = ticketCounter * adultTicket + kidsCounter * kidsTicket;
        double profit = totalPrice * 0.20;
        System.out.printf("The profit of your agency from %s tickets is %.2f lv.",name,profit);
    }
}
