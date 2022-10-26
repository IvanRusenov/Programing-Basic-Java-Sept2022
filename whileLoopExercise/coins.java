package whileLoopExercise;

import java.util.Scanner;

public class coins {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double rest = Double.parseDouble(scan.nextLine());
        int count = 0;
        while (rest>0){
            count++;
           rest = Math.round(rest * 100.0)/100.0;
            if (rest >= 2){
                rest -= 2;
            } else if (rest >= 1) {
                rest -= 1;
            }else if (rest >= 0.50){
                rest -= 0.50;
            } else if (rest >= 0.20) {
                rest -= 0.20;
            } else if (rest >= 0.10) {
                rest -= 0.10;
            } else if (rest >= 0.05) {
                rest -= 0.05;
            } else if (rest >= 0.02) {
                rest -= 0.02;
            } else if (rest >= 0.01)  {
                rest -= 0.01;
            }
        }
        System.out.println(count);

    }
}
