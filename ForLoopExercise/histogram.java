package ForLoopExercise;

import java.util.Scanner;

public class histogram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int p1 =0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;
        double percent = 0.0;
        

        for (int i = 1; i <=n ; i++) {
            int num = Integer.parseInt(scan.nextLine());
            if (num < 200){
                p1 ++;
            } else if (num < 400) {
                p2 ++;
            } else if (num < 600) {
                p3 ++;
            } else if (num < 800) {
                p4 ++;
            } else if (num >= 800) {
                p5 ++;
            }
        }
        percent = 1.0 * p1 / n * 100;
        System.out.printf("%.2f%%%n",percent);
        percent = 1.0 * p2 / n * 100;
        System.out.printf("%.2f%%%n",percent);
        percent = 1.0 * p3 / n * 100;
        System.out.printf("%.2f%%%n",percent);
        percent = 1.0 * p4 / n * 100;
        System.out.printf("%.2f%%%n",percent);
        percent = 1.0 * p5 / n * 100;
        System.out.printf("%.2f%%%n",percent);
    }
}
