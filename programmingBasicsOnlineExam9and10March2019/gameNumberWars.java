package programmingBasicsOnlineExam9and10March2019;

import java.util.Scanner;

public class gameNumberWars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String firstPlayerName = scan.nextLine();
        String secondPlayerName = scan.nextLine();
        boolean isWinner = false;
        int fpPoints =0;
        int sfPoints = 0;
        String winnerName ="";
        int winnerPoints = 0;

        while  (true){
            String first= scan.nextLine();
            if (first.equals("End of game")){
                break;
            }
            String second = scan.nextLine();
            int firstPlayerCard = Integer.parseInt(first);
            int secondPlayerCard = Integer.parseInt(second);

            if (isWinner){
                if (firstPlayerCard > secondPlayerCard){
//                    fpPoints = firstPlayerCard-secondPlayerCard;
                    winnerName =firstPlayerName;
                    winnerPoints = fpPoints;
                }else if (secondPlayerCard > firstPlayerCard){
//                    sfPoints = secondPlayerCard-firstPlayerCard;
                    winnerName = secondPlayerName;
                    winnerPoints = sfPoints;
                }
                System.out.printf("%s is winner with %d points",winnerName,winnerPoints);
                break;
            }

            if (firstPlayerCard > secondPlayerCard){
                fpPoints += firstPlayerCard-secondPlayerCard;
            }else if (secondPlayerCard > firstPlayerCard){
                sfPoints += secondPlayerCard-firstPlayerCard;
            }else {
                System.out.println("Number wars!");
                isWinner = true;
                continue;
            }
        }
        if (!isWinner){
            System.out.printf("%s has %d points%n",firstPlayerName,fpPoints);
            System.out.printf("%s has %d points%n",secondPlayerName,sfPoints);
        }
    }
}
