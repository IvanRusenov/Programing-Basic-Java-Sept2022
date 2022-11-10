package programmingBasicOnlineExam6and7July2019;

import java.util.Scanner;

public class poolDay {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = Integer.parseInt(scan.nextLine());
        double tax = Double.parseDouble(scan.nextLine());
        double sunLounger = Double.parseDouble(scan.nextLine());
        double umbrella = Double.parseDouble(scan.nextLine());
        double price = 0.0;

        price = 1.0 * count * tax;
        double sunLongNeeded = Math.ceil(count * 0.75) * sunLounger;
        double umbrellaNeeded = Math.ceil(count * 0.50) * umbrella;
        double finalPrice = price + sunLongNeeded + umbrellaNeeded;

        System.out.printf("%.2f lv.", finalPrice);

    }
}
