package whileLoopLab;

import java.util.Scanner;

public class sequence2kPlus1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int sum = 1;
        while ( n >= sum ){
            System.out.println(sum);
            sum = sum * 2 + 1;
        }
    }
}
