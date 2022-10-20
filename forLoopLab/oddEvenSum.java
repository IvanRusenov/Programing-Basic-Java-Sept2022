package forLoopLab;

import java.util.Scanner;

public class oddEvenSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int sum1 =0;
        int sum2 = 0;

        for (int i = 1; i<=n ; i++) {
            int num = Integer.parseInt(scan.nextLine());
            if(i%2 == 0){
                sum1 += num;
            }else {
                sum2 +=num;
            }
        }
        int diff = Math.abs(sum1-sum2);
        if (sum1==sum2){
            System.out.println("Yes");
            System.out.printf("Sum = %d",sum1);
        }else {
            System.out.println("No");
            System.out.printf("Diff = %d",diff);
        }
    }
}
