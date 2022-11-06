package NestedLoopsMoreExercises;

import java.util.Scanner;

public class profit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lv1 = Integer.parseInt(scan.nextLine());
        int lv2 = Integer.parseInt(scan.nextLine());
        int lv5 = Integer.parseInt(scan.nextLine());
        int sum = Integer.parseInt(scan.nextLine());
        for (int i = 0; i <= lv1; i++) {
            for (int j = 0; j <= lv2; j++) {
                for (int k = 0; k <= lv5; k++) {
                    int total = i + j * 2 + k * 5;
                    if (sum == total) {
                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.%n", i, j, k, total);
                    }
                }
            }
        }


    }
}
