package ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class invalidNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        boolean bool = false;

        if ( num >= 100 && num <= 200 || num == 0) {

            bool = true;
        }

        if (!bool){
            System.out.println("invalid");
        }
    }
}
