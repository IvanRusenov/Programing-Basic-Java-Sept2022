package programmingBasicsOnlineExam9and10March2019Part2;

import java.util.Scanner;

public class darts04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        String area = scan.nextLine();
        int score = 301;
        int countSuccess = 0;
        int countNotSucceed = 0;
        while (!area.equals("Retire")){
            int points = Integer.parseInt(scan.nextLine());
            if (area.equals("Double")) {
                points *= 2;
            } else if (area.equals("Triple")) {
                points *= 3;
            }
            if (points > score){
                countNotSucceed++;
                area = scan.nextLine();
                continue;
            }
            countSuccess++;
            score -= points;
            if (score == 0){

                break;
            }
            area = scan.nextLine();

        }
        if (score == 0){
            System.out.printf("%s won the leg with %d shots.",name,countSuccess);
        }else {
            System.out.printf("%s retired after %d unsuccessful shots.",name,countNotSucceed);
        }

    }
}
