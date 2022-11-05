package NestedLoopsMoreExercises;

import java.util.Scanner;

public class safePasswordsGenerator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        int max = Integer.parseInt(scan.nextLine());
        int count = 0;
        boolean isMax = false;
        int fl = 35;
        int sl = 64;
        for (int i = 1; i <= a; i++) {
            if (isMax) {
                break;
            }
            for (int j = 1; j <= b; j++) {

                if (count == max) {
                    isMax = true;
                    break;
                }
                System.out.printf("%c%c%d%d%c%c|", fl, sl, i, j, sl, fl);
                fl++;
                if (fl > 55) {
                    fl = 35;
                }
                sl++;
                if (sl > 96) {
                    sl = 64;
                }
                count++;
            }
        }
    }
}
