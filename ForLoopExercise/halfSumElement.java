package ForLoopExercise;

import java.util.Scanner;

public class halfSumElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());
        int sum = 0;

        int maxNum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;

        for (int i = 1; i <=num ; i++) {
            int n = Integer.parseInt(scan.nextLine());
            sum += n;
            if (n > maxNum){
                maxNum = n;
            }
        }
        int diff =Math.abs(sum - maxNum);
        if (diff == maxNum){
            System.out.println("Yes");
            System.out.printf("Sum = %d",diff);
        }else {
            System.out.println("No");
            System.out.printf("Diff = %d",Math.abs(maxNum - diff));
        }


    }
}
