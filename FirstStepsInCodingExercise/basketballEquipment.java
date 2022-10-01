package FirstStepsInCodingExercise;

import java.util.Scanner;

public class basketballEquipment {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int tax = Integer.parseInt(scan.nextLine());

        double shoes  = tax - (tax*0.40);
        double outfit = shoes -(shoes*0.20);
        double ball = outfit / 4;
        double acc = ball / 5;

        double price = tax + shoes + outfit + ball + acc;

        System.out.println(price);


    }
}
