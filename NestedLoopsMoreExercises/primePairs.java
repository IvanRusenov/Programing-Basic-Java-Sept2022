package NestedLoopsMoreExercises;

import java.util.Scanner;

public class primePairs {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int firstPear = Integer.parseInt(scan.nextLine());
        int secPear = Integer.parseInt(scan.nextLine());
        int firstPearTo = Integer.parseInt(scan.nextLine());
        int secondPearTo = Integer.parseInt(scan.nextLine());


        for (int i = firstPear; i <= firstPear + firstPearTo; i++) {
            boolean isPrime =false;
            int counter =0;
            for (int k = i; k >0 ; k--) {
                if (i % k ==0){
                    counter++;
                }
            }
            if (counter == 2){
                isPrime = true;
            }
            counter =0;
            if (isPrime){
                for (int j = secPear; j <= secPear + secondPearTo; j++) {
                    isPrime = false;
                    for (int l = j; l > 0 ; l--) {
                        if ( j % l == 0){
                            counter++;
                        }
                    }
                    if (counter == 2 ){
                        isPrime = true;
                    }
                    counter=0;

                    if (isPrime){
                        String num = "" + i + j;
                        System.out.println(num);
                    }
                }
            }
        }
    }
}
