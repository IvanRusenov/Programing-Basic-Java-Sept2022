package programmingBasicsOnlineExam20and2Apri2019Part2;

import java.util.Scanner;

public class easterEggsBattle04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstPlayer = Integer.parseInt(scan.nextLine());
        int secondPlayer = Integer.parseInt(scan.nextLine());
        String winner = scan.nextLine();
        while (!winner.equals("End")){

            if (winner.equals("one")){
                secondPlayer--;
            } else if (winner.equals("two")) {
                firstPlayer--;
            }
            if (firstPlayer<=0){
                System.out.printf("Player one is out of eggs. Player two has %d eggs left.",secondPlayer);
                break;
            } else if (secondPlayer <= 0) {
                System.out.printf("Player two is out of eggs. Player one has %d eggs left.",firstPlayer);
                break;
            }
            winner = scan.nextLine();
        }
        if (firstPlayer>0 && secondPlayer>0){
            System.out.printf("Player one has %d eggs left.\n",firstPlayer);
            System.out.printf("Player two has %d eggs left.",secondPlayer);
        }

    }
}
