package programmingBasicsOnlinePreExam22and23October2022;

import java.util.Scanner;

public class computerFirm04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int computers = Integer.parseInt(scan.nextLine());
        double totalSales = 0.0;
        int totalRating = 0;
        for (int i = 0; i < computers; i++) {
            int num = Integer.parseInt(scan.nextLine());
            int rating = num % 10;
            int posibleSales = num /10;
            double sales = 0;
            if (rating == 2){
                sales = posibleSales * 0.0;
            } else if (rating == 3) {
                sales = posibleSales * 0.50;
            } else if (rating == 4) {
                sales = posibleSales * 0.70;
            } else if (rating == 5) {
                sales = posibleSales * 0.85;
            } else if (rating == 6) {
                sales = posibleSales * 1.00;
            }
            totalRating+=rating;
            totalSales+=sales;
        }
        System.out.printf("%.2f\n",totalSales);
        double avgRating = 1.0 * totalRating / computers;
        System.out.printf("%.2f\n",avgRating);
    }
}
