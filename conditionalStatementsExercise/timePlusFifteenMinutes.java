package conditionalStatementsExercise;

import java.util.Scanner;

public class timePlusFifteenMinutes {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int hour = Integer.parseInt(scan.nextLine());
        int min = Integer.parseInt(scan.nextLine());

        int totalTimeInSec = hour * 60 + min + 15;

        int newHour = totalTimeInSec / 60;
        int newMin = totalTimeInSec % 60;

        if (newHour > 23){

            newHour = 0;
        }

        if (newMin < 10) {
            System.out.printf("%d:0%d", newHour, newMin);

        }else {
            System.out.printf("%d:%d", newHour, newMin);
        }

    }
}
