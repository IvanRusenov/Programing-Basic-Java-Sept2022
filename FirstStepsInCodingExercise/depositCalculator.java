package FirstStepsInCodingExercise;

import java.util.Scanner;

public class depositCalculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double deposit = Double.parseDouble(scan.nextLine());
        int term = Integer.parseInt(scan.nextLine());
        double air = Double.parseDouble(scan.nextLine());

        double interest = deposit * air/100;
        double interestMonth = interest / 12;
        double sum = deposit + term * interestMonth;

        System.out.println(sum);



    }
}
