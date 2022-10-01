package FirstStepsInCodingExercise;

import java.util.Scanner;

public class repainting {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int nylon = Integer.parseInt(scan.nextLine());
        int paint = Integer.parseInt(scan.nextLine());
        int thinner = Integer.parseInt(scan.nextLine());
        int hours = Integer.parseInt(scan.nextLine());

        double nyllonSum = (nylon + 2) * 1.5;
        double paintSum = (paint * 1.10) * 14.5;
        double thinnerSum = thinner * 5;
        double materialSum  = nyllonSum + paintSum + thinnerSum + 0.40;
        double workSumHour = materialSum *0.30;
        double totalWorkSum = workSumHour * hours;
        double totalExpenses = materialSum + totalWorkSum;

        System.out.println(totalExpenses);


    }
}
