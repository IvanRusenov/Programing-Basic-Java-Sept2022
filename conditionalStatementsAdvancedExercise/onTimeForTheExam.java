package conditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class onTimeForTheExam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arrivalHour = Integer.parseInt(scan.nextLine());
        int arrivalMinutes = Integer.parseInt(scan.nextLine());
        int examHour = Integer.parseInt(scan.nextLine());
        int examMinutes = Integer.parseInt(scan.nextLine());
        int arrivalTimeInMin = arrivalHour * 60 + arrivalMinutes;
        int examTimeInMin = examHour * 60 + examMinutes;
        int diff = arrivalTimeInMin - examTimeInMin;
        int hour = diff / 60;
        int min = diff % 60;
        //int diffHour = 0;
        if (diff > 30) {
            //earli
            System.out.println("Early");
            if (diff > 0 && diff < 60) {
                System.out.printf("%d minutes before the start", min);
            } else if (diff >= 60) {
                if (min < 10) {
                    System.out.printf("%d:0%d hours before the start", hour, min);
                } else {
                    System.out.printf("%d:%d hours before the start", hour, min);
                }

            }

        } else if (diff < 0) {
            //late
            System.out.println("Late");
            diff = Math.abs(diff);//махам минуса
            hour = diff / 60;
            min = diff % 60;
            if (diff > 0 && diff < 60) {
                System.out.printf("%d minutes after the start", min);
            } else if (diff >= 60) {
            if (min < 10) {
                System.out.printf("%d:0%d hours after the start", hour, min);
            } else {
                System.out.printf("%d:%d hours after the start", hour, min);
            }

        }
    } else if(diff > 0){
        //onTime или 30 мин по рано
        System.out.println("On time");
        System.out.printf("%d minutes before the start", min);
    } else {
            // time == 0
        System.out.println("On time");
    }
}
}





