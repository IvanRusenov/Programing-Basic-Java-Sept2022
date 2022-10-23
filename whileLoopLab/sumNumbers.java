package whileLoopLab;

import java.util.Scanner;

public class sumNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int sum = 0;

        while (sum<n){
            int num =  Integer.parseInt(scan.nextLine());
            sum+=num;

        }
        System.out.println(sum);
    }
}
