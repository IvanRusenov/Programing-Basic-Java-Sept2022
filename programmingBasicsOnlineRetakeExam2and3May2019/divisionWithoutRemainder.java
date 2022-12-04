package programmingBasicsOnlineRetakeExam2and3May2019;

import java.util.Scanner;

public class divisionWithoutRemainder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int count1 =0;
        int count2 =0;
        int count3 = 0;
        double percent = 0.0;

        for (int i = 1; i <=n ; i++) {
            int num = Integer.parseInt(scan.nextLine());
            if (num % 2 ==0 ){
                count1++;
            }
            if (num % 3 == 0){
                count2++;
            }
            if (num % 4 ==0){
                count3++;
            }

        }
        System.out.printf("%.2f%%%n",1.0 * count1 / n * 100);
        System.out.printf("%.2f%%%n",1.0 * count2 / n * 100);
        System.out.printf("%.2f%%%n",1.0 * count3 / n * 100);
    }
}
