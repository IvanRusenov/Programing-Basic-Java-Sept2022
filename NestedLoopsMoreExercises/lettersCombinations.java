package NestedLoopsMoreExercises;

import java.util.Scanner;

public class lettersCombinations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      char a = scan.next().charAt(0);
      char b = scan.next().charAt(0);
      char c = scan.next().charAt(0);
      int counter = 0;

        for (char i = a; i <= b ; i++) {
            for (char j = a; j <= b ; j++) {
                for (char k = a; k <= b ; k++) {
                    if (j != c && i != c && k!= c){
                        counter++;
                        System.out.printf("%c%c%c ",i,j,k);
                    }
                }
            }
        }
        System.out.println(counter);
    }
}
