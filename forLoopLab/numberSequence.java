package forLoopLab;

import java.util.Scanner;

public class numberSequence {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int maxNumber =Integer.MIN_VALUE;
        int minNumber = Integer.MAX_VALUE;

        for (int i = 0; i < n  ; i++){
            int num = Integer.parseInt(scan.nextLine());
            if (num >= maxNumber){
                maxNumber = num;
            }
            if (num <= minNumber){
                minNumber = num;
            }
        }
        System.out.printf("Max number: %d%n",maxNumber);
        System.out.printf("Min number: %d",minNumber);
    }
}
