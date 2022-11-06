package NestedLoopsMoreExercises;

import java.util.Scanner;

public class secretDoorsLock {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int top100 = Integer.parseInt(scan.nextLine());
        int top10 = Integer.parseInt(scan.nextLine());
        int top1 = Integer.parseInt(scan.nextLine());
        for (int i = 1; i <= top100; i++) {
            for (int j = 1; j <= top10; j++) {
                int counter = 0;
                for (int m = j; m > 0; m--) {
                    if (j % m == 0) {
                        counter++;
                    }
                }
                if (counter == 2) {
                    for (int k = 1; k <= top1; k++) {
                        if (i % 2 == 0 && k % 2 == 0 && j >= 2 && j <= 7) {
                            //String num = "" + i + j + k;
                            System.out.printf("%d %d %d %n", i, j, k);
                        }
                    }
                }
            }
        }
    }
}
