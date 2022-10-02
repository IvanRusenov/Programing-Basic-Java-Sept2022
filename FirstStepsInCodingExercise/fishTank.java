package FirstStepsInCodingExercise;

import java.util.Scanner;

public class fishTank {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int lenght = Integer.parseInt(scan.nextLine());
        int width = Integer.parseInt(scan.nextLine());
        int height = Integer.parseInt(scan.nextLine());
        double percent = Double.parseDouble(scan.nextLine());

        double volume = lenght * width * height;

        double liters = volume / 1000;
        double fill = percent / 100;
        double litNeeded = liters * (1-fill);

        System.out.println(litNeeded);




    }
}
