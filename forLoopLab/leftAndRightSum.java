package forLoopLab;

import java.util.Scanner;

public class leftAndRightSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int sum = 0;
        int sum2 =0;

        for (int i =1; i <= 2*n; i++){
            int num = Integer.parseInt(scan.nextLine());
            if (i <= n){
                sum += num;
            }else {
                sum2 +=num;
            }
        }
        if (sum == sum2){
            System.out.printf("Yes, sum = %d",sum);
        }else {
            System.out.printf("No, diff = %d",Math.abs(sum-sum2));
        }

    }
}
