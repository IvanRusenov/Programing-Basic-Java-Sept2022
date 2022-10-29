package nestedLoopsLab;

import java.util.Scanner;

public class building {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int levels = Integer.parseInt(scan.nextLine());
        int rooms = Integer.parseInt(scan.nextLine());
        for (int i = levels; i > 0 ; i--) {
            for (int j = 0; j < rooms ; j++) {
                if (i != levels){
                    if (i%2!=0){
                        System.out.printf("A%d%d ",i,j);
                    }else {
                        System.out.printf("O%d%d ",i,j);
                    }
                }else {
                    System.out.printf("L%d%d ",i,j);
                }
            }
            System.out.println();
        }
    }
}
