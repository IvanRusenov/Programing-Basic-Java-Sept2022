package conditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class cinema {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        int rows = Integer.parseInt(scan.nextLine());
        int cols = Integer.parseInt(scan.nextLine());
        int seats = rows * cols;
        double price = 0.0;


        if (name.equals("Premiere")){
            price = seats * 12.00;
        }else if (name.equals("Normal")){
            price = seats * 7.50;
        }else if (name.equals("Discount")){
            price = seats * 5.00;
        }

        System.out.printf("%.2f leva",price);


    }
}
