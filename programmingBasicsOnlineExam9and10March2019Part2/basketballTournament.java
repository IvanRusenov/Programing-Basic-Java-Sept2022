package programmingBasicsOnlineExam9and10March2019Part2;

import java.util.Scanner;

public class basketballTournament {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int countWins = 0;
        int countLoses = 0;
        int countMaches = 0;

        while (!name.equals("End of tournaments")) {
            int count = 0;
            int matches = Integer.parseInt(scan.nextLine());
            countMaches+=matches;
            for (int i = 0; i < matches; i++) {
                count++;
                int homePoints = Integer.parseInt(scan.nextLine());
                int guestPoints = Integer.parseInt(scan.nextLine());
                int diff = Math.abs(homePoints - guestPoints);
                if (homePoints>guestPoints){
                    System.out.printf("Game %d of tournament %s: win with %d points.\n",count,name,diff);
                    countWins++;
                }else {
                    System.out.printf("Game %d of tournament %s: lost with %d points.\n",count,name,diff);
                    countLoses++;
                }
            }

            name = scan.nextLine();
        }
        double percentWins = 1.0 * countWins / countMaches * 100;
        System.out.printf("%.2f%% matches win\n",percentWins);
        double percentLoses = 1.0 * countLoses / countMaches * 100;
        System.out.printf("%.2f%% matches lost\n",percentLoses);
    }
}
