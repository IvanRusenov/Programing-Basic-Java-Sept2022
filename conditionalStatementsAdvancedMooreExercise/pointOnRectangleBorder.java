package conditionalStatementsAdvancedMooreExercise;

import java.util.Scanner;

public class pointOnRectangleBorder {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double x1 = Double.parseDouble(scan.nextLine());
        double y1 = Double.parseDouble(scan.nextLine());
        double x2 = Double.parseDouble(scan.nextLine());
        double y2 = Double.parseDouble(scan.nextLine());
        double x = Double.parseDouble(scan.nextLine());
        double y = Double.parseDouble(scan.nextLine());
            //•	x съвпада с x1 или x2 и същевременно y е между y1 и y2
            //•	y съвпада с y1 или y2 и същевременно x е между x1 и x2
        if ((x1 <x2) &&(y1<y2)){
            if ( (x == x1 || x == x2) && (y >= y1 && y <= y2) ){
                System.out.println("Border");
            } else if ( (y == y1 || y == y2) && (x >= x1 && x <= x2) ) {
                System.out.println("Border");
            }else {
                System.out.println("Inside / Outside");
            }
        }else {
            System.out.println("Inside / Outside");
        }
    }
}
