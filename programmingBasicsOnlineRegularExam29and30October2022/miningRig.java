package programmingBasicsOnlineRegularExam29and30October2022;

import java.util.Scanner;

public class miningRig {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int vcPrice = Integer.parseInt(scan.nextLine());
        int transPrice = Integer.parseInt(scan.nextLine());
        double elPricePerDay = Double.parseDouble(scan.nextLine());
        double profitPerDay = Double.parseDouble(scan.nextLine());
        double allPrice = vcPrice * 13.00;
        double allTransPrice = transPrice * 13.00;
        double totalSpend = allPrice + allTransPrice + 1000.00;
        double allProfitPerDay = 13.00 * (profitPerDay - elPricePerDay);
        double daysToReturnTheInvestment = Math.ceil(totalSpend / allProfitPerDay);
        System.out.printf("%.0f\n", totalSpend);
        System.out.printf("%.0f", daysToReturnTheInvestment);
    }
}
