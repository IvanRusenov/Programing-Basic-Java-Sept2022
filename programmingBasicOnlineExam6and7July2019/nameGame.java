package programmingBasicOnlineExam6and7July2019;

import java.util.Scanner;

public class nameGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        int points = 0;
        String winner = "";
        int maxPoints = Integer.MIN_VALUE;

        while (!name.equals("Stop")){
            points =0;
            for (int i = 0; i < name.length() ; i++) {
                char letter = name.charAt(i);
                int guess = Integer.parseInt(scan.nextLine());
                if (letter == guess){
                    points += 10;
                }else {
                    points += 2;
                }
            }
            if (points >= maxPoints){
                maxPoints = points;
                winner = name;
            }

            name = scan.nextLine();

        }
        System.out.printf("The winner is %s with %d points!",winner,maxPoints);

    }
}
