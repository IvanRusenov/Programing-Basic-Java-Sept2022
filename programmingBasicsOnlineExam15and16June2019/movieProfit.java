package programmingBasicsOnlineExam15and16June2019;

import java.util.Scanner;

public class movieProfit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        int countDays = Integer.parseInt(scan.nextLine());
        int countTickets = Integer.parseInt(scan.nextLine());
        double ticketPrice = Double.parseDouble(scan.nextLine());
        int percent = Integer.parseInt(scan.nextLine());

        double price = ticketPrice *  countTickets * countDays  ;
        double totalPrice = price - (price * percent/100);
        System.out.printf("The profit from the movie %s is %.2f lv.",name,totalPrice);
    }
}
