package NestedLoopsMoreExercises;

import java.util.Scanner;

public class carNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int start = Integer.parseInt(scan.nextLine());
        int end = Integer.parseInt(scan.nextLine());
        int sum = 0;

        for (int i = start; i <=end  ; i++) {
            for (int j = start; j <= end ; j++) {
                for (int k = start; k <= end ; k++) {
                    for (int l = start; l <= end ; l++) {
                        if (i % 2 == 0 && l % 2 != 0 && i>l && (j + k) % 2 == 0){
                            System.out.printf("%d%d%d%d ",i,j,k,l);
                        } else if (i % 2 != 0 && l % 2 == 0 && i > l && (j + k) % 2 == 0) {
                            System.out.printf("%d%d%d%d ",i,j,k,l);
                        }
                    }
                }
                
            }
            
        }
    }
}
