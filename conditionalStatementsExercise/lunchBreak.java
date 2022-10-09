package conditionalStatementsExercise;

import java.util.Scanner;

public class lunchBreak {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String serName = scan.nextLine();
        int epTime = Integer.parseInt(scan.nextLine());
        int breakTime = Integer.parseInt(scan.nextLine());

        double lunchTime = breakTime / 8.0;
        double  relaxTime = breakTime / 4.0;

        double  restTime = breakTime - lunchTime - relaxTime;
        double  diff = Math.abs(restTime - epTime);

        if (restTime >= epTime){
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.",serName, Math.ceil(diff));
        }else {

            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.",serName, Math.ceil(diff));
        }

    }
}
