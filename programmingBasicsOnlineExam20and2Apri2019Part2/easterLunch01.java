package programmingBasicsOnlineExam20and2Apri2019Part2;

import java.util.Scanner;

public class easterLunch01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

         int easterBreadCount = Integer.parseInt(scan.nextLine());
         int eggCount = Integer.parseInt(scan.nextLine());
         int kgCookies = Integer.parseInt(scan.nextLine());
         double eggsPaint = eggCount * 12 * 0.15;
         double price = easterBreadCount * 3.20 + eggCount * 4.35 + kgCookies * 5.40 + eggsPaint;
        System.out.printf("%.2f ",price);
    }
}
