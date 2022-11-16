package programmingBasicsOnlineExam15and16June2019;

import java.util.Scanner;

public class favoriteMovie {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        int points = 0;
        int counter = 0;
        int maxSum = Integer.MIN_VALUE;
        String bestMovie = "";


        while (!name.equals("STOP")){
            counter++;
            if (counter >= 7){
                System.out.println("The limit is reached.");
                break;
            }
            points = 0;
            for (int i = 0; i < name.length() ; i++) {
                int letter = name.charAt(i);
                if (letter >= 97 && letter <=122){
                    points += (letter - (2 * name.length()));
                } else if (letter >= 65 && letter <=90) {
                    points += (letter - name.length());
                }else {
                    points += letter;
                }

            }
            if (points > maxSum){
                maxSum = points;
                bestMovie = name;
            }

            name = scan.nextLine();
        }
        System.out.printf("The best movie for you is %s with %d ASCII sum.",bestMovie,maxSum);

    }
}
