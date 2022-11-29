package programmingBasicsOnlineExam28and29March2020;

import java.util.Scanner;

public class tournamentOfChristmas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tournirDays = Integer.parseInt(scan.nextLine());
        double totalMoney = 0.0;
        int winDay = 0;
        int loseDay = 0;

        for (int i = 1; i <= tournirDays ; i++) {

            String sport = scan.nextLine();
            int winCount = 0;
            int loseCount = 0;
            double winMoney = 0.0;
            while (!sport.equals("Finish")){
                String winOrLose= scan.nextLine();

                if (winOrLose.equals("win")){
                    winMoney +=20;
                    winCount++;
                }else {
                    loseCount++;
                }



                sport = scan.nextLine();
            }
            if (winCount>loseCount){
                winMoney = winMoney * 1.10;
                winDay ++;
            }else {
                loseDay++;
            }
            totalMoney += winMoney;
        }
        if (winDay>loseDay){
            totalMoney = totalMoney * 1.20;
            System.out.printf("You won the tournament! Total raised money: %.2f",totalMoney);
        }else {
            System.out.printf("You lost the tournament! Total raised money: %.2f",totalMoney);
        }
    }
}
