package NestedLoopsMoreExercises;

import java.util.Scanner;

public class challengeTheWedding1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int mans = Integer.parseInt(scan.nextLine());
        int womans = Integer.parseInt(scan.nextLine());
        int tables = Integer.parseInt(scan.nextLine());
        int counter = 0;
        boolean isFull = false;
        for (int i = 1; i <= mans ; i++) {
            if(isFull){
                break;
            }
            for (int j = 1; j <= womans ; j++) {
                if (counter == tables){
                    isFull = true;
                    break;
                }
                System.out.printf("(%d <-> %d) ",i,j);
                counter++;

            }
        }
    }
}
