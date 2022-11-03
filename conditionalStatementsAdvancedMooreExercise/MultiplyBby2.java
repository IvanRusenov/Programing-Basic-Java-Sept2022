package conditionalStatementsAdvancedMooreExercise;

import java.util.Scanner;

public class MultiplyBby2 {
    public static void main(String[] args) {

        Scanner scann = new Scanner(System.in);
        double num = 0.00;
        double result = 0.00;

        while (num >= 0) {
                num = Double.parseDouble(scann.nextLine());
                if (num>=0) {
                    result = num * 2;
                    System.out.printf("Result: %.2f%n", result);
                }
        }
        System.out.println("Negative number!");
    }
}
