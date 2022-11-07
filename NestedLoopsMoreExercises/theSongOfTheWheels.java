package NestedLoopsMoreExercises;

import java.util.Scanner;

public class theSongOfTheWheels {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = Integer.parseInt(scan.nextLine());
        int counter = 0;
        String password = "";
        boolean isPassword = false;
        for (int i = 1; i <=9 ; i++) {
            for (int j = 1; j <=9 ; j++) {
                for (int k = 1; k <=9 ; k++) {
                    for (int l = 1; l <=9 ; l++) {
                        if(i<j && k>l && m == i*j + k*l){
                            System.out.printf("%d%d%d%d ",i,j,k,l);
                            counter++;
                            if (counter == 4){
                                password = "" + i+j+k+l;
                                isPassword = true;
                            }
                        }
                    }
                }
            }
        }
        if (isPassword){
            System.out.println();
            System.out.println("Password: " + password);
        }else{
            System.out.println();
            System.out.println("No!");
        }
    }
}
