package ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class personalTitles {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double age = Double.parseDouble(scan.nextLine());
        String gender = scan.nextLine();

        if (gender.equals("m")) {

            if (age < 16) {
                System.out.println("Master");
            } else if (age >= 16) {
                System.out.println("Mr.");
            }

        } else if (gender.equals("f")) {

            if (age < 16) {

                System.out.println("Miss");

            } else if (age >= 16) {

                System.out.println("Ms.");

            }
        }
    }
}
