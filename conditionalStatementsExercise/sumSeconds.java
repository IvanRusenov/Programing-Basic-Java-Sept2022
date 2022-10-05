package conditionalStatementsExercise;

import java.util.Scanner;

public class sumSeconds {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int firstTime = Integer.parseInt(scan.nextLine());
        int secondTime = Integer.parseInt(scan.nextLine());
        int thirdTime = Integer.parseInt(scan.nextLine());

        int sumTime = firstTime + secondTime + thirdTime;
        int min = sumTime / 60;
        int sec = sumTime % 60;

        if (sec < 10){
            System.out.printf("%d:0%d", min, sec);
        }else {
            System.out.printf("%d:%d", min, sec);
        }




    }

}
