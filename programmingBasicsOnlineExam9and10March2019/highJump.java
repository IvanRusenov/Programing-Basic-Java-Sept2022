package programmingBasicsOnlineExam9and10March2019;

import java.util.Scanner;

public class highJump {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int wantedHigh = Integer.parseInt(scan.nextLine());
        int firstHigh = wantedHigh - 30;
        int counter = 0;
        int counterAll =0;
        boolean isSuccess = false;

        while (counter < 3 ){
            counterAll++;
            int jump = Integer.parseInt(scan.nextLine());
            if (jump>firstHigh){
                firstHigh+=5;
                counter = 0;
            }else {
                counter++;
                continue;
            }
            if (firstHigh > wantedHigh){
                isSuccess = true;
                break;
            }

        }
        if(isSuccess){
            System.out.printf("Tihomir succeeded, he jumped over %dcm after %d jumps.",wantedHigh,counterAll);
        }else {
            System.out.printf("Tihomir failed at %dcm after %d jumps.",firstHigh,counterAll);
        }
    }
}
