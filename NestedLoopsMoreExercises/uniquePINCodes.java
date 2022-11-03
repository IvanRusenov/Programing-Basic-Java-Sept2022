package NestedLoopsMoreExercises;

import java.util.Scanner;

public class uniquePINCodes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count =0;

        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        int c = Integer.parseInt(scan.nextLine());
        for (int i = 1; i <= a ; i++) {
            for (int j = 1; j <= b ; j++) {
                count=0;
                for (int m = j; m >0 ; m--) {
                    if(j%m == 0){
                        count++;
                    }

                }
                if(count == 2){
                    for (int k = 1; k <= c ; k++) {
                        if (i%2 == 0 && k%2==0){
                            System.out.printf("%d %d %d%n",i,j,k);
                        }
                    }
                }
            }
        }
    }
}
