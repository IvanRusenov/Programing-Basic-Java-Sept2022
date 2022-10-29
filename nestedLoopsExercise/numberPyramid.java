package nestedLoopsExercise;

import java.util.Scanner;

public class numberPyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int current = 0;
        boolean isBigger = false;
        for (int i = 1; i <=n ; i++) {
            if (current>n){
                break;
            }
            System.out.println();
            for (int j = 1; j <= i ; j++) {
                current++;
                if (current >n){
                    break;
                }
                System.out.printf("%d ",current);
            }
        }
    }
}
