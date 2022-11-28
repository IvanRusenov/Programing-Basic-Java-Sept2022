package programmingBasicsOnlineExam28and29March2020;

import java.util.Scanner;

public class careOfPuppy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int foodKg = Integer.parseInt(scan.nextLine());
        int foodGr = foodKg * 1000;
        String input = scan.nextLine();
        int totalEaten = 0;

        while(!input.equals("Adopted")){
            int eaten = Integer.parseInt(input);
            totalEaten +=eaten;
            input = scan.nextLine();

        }
        int diff = Math.abs(totalEaten-foodGr);
        if (totalEaten <= foodGr ){
            System.out.printf("Food is enough! Leftovers: %d grams.",diff);
        }else {
            System.out.printf("Food is not enough. You need %d grams more.",diff);
        }
    }

}
