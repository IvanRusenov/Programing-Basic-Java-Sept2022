package programmingBasicOnlineExam6and7July2019;

import java.util.Scanner;

public class familyTrip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        int nightsCount = Integer.parseInt(scan.nextLine());
        double pricePerNight = Double.parseDouble(scan.nextLine());
        int expences = Integer.parseInt(scan.nextLine());

        if (nightsCount >7){
            pricePerNight = pricePerNight * 0.95;
        }
        double price = nightsCount * pricePerNight;
        price = price + (budget * (1.0 * expences/100));
        double diff = Math.abs(price - budget);
        if (budget>=price){
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.",diff);
        }else {
            System.out.printf("%.2f leva needed.",diff);
        }

    }
}
