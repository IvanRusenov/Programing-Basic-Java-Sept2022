package NestedLoopsMoreExercises;

import java.util.Scanner;

public class weddingSeats {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String sector = scan.nextLine();
        int rows = Integer.parseInt(scan.nextLine());
        int seats = Integer.parseInt(scan.nextLine());
        char u = sector.charAt(0);

        int sectorint = u ;
        int counter = 0;

        for (int i = 65; i <= sectorint; i++) {
            if (i >65){
                rows++;
            }
            for (int j = 1; j <= rows  ; j++) {

                if (j % 2 == 0){
                    for (int k = 97; k < seats + 99 ; k++) {
                        System.out.printf("%c%d%c%n",i,j,k);
                        counter++;
                    }
                }else {
                    for (int k = 97; k < seats + 97 ; k++) {
                        System.out.printf("%c%d%c%n",i,j,k);
                        counter++;
                    }

                }

            }
        }
        System.out.println(counter);
    }

}
