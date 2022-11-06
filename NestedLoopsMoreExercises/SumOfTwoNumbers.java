package NestedLoopsMoreExercises;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int start = Integer.parseInt(scan.nextLine());
        int end = Integer.parseInt(scan.nextLine());
        int magicNum = Integer.parseInt(scan.nextLine());
        int counter = 0;
        boolean isResult = false;
        for (int i = start; i <= end; i++) {
            if (isResult) {
                break;
            }
            for (int j = start; j <= end; j++) {
                counter++;
                if (i + j == magicNum) {
                    System.out.printf("Combination N:%d (%d + %d = %d)%n", counter, i, j, magicNum);
                    isResult = true;
                    break;
                }
            }
        }
        if (!isResult) {
            System.out.printf("%d combinations - neither equals %d", counter, magicNum);
        }
    }
}
