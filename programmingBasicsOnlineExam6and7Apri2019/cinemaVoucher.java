package programmingBasicsOnlineExam6and7Apri2019;

import java.util.Scanner;

public class cinemaVoucher {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int voucher = Integer.parseInt(scan.nextLine());
        String stock = scan.nextLine();
        int price = 0;
        int count = 0;
        int countOthers = 0;

        while (!stock.equals("End")){

            if (stock.length()>8){
                price = (int)(stock.charAt(0)) + (int)(stock.charAt(1));
                voucher -= price;
                if (voucher < 0){
                    break;
                }
                count++;
            }else {
                price = stock.charAt(0);
                voucher -= price;
                if (voucher < 0){
                    break;
                }
                countOthers++;
            }

            stock =scan.nextLine();
        }
        System.out.println(count);
        System.out.println(countOthers);
    }
}
