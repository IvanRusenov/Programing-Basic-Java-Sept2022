package programmingBasicsOnlineExam9and10March2019;

import java.util.Scanner;

public class footballResults {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String firstMach = scan.nextLine();
        String secondMach = scan.nextLine();
        String thirdMach = scan.nextLine();
        int winCount = 0;
        int equalCaunt = 0;
        int loseCaunt = 0;

        if (firstMach.charAt(0)>firstMach.charAt(2)){
            winCount++;
        } else if (firstMach.charAt(0) == firstMach.charAt(2)) {
            equalCaunt++;
        } else if (firstMach.charAt(0) < firstMach.charAt(2)) {
            loseCaunt++;
        }

        if (secondMach.charAt(0)>secondMach.charAt(2)){
            winCount++;
        } else if (secondMach.charAt(0) == secondMach.charAt(2)) {
            equalCaunt++;
        } else if (secondMach.charAt(0) < secondMach.charAt(2)) {
            loseCaunt++;
        }


        if (thirdMach.charAt(0)>thirdMach.charAt(2)){
            winCount++;
        } else if (thirdMach.charAt(0) == thirdMach.charAt(2)) {
            equalCaunt++;
        } else if (thirdMach.charAt(0) < thirdMach.charAt(2)) {
            loseCaunt++;
        }

        System.out.printf("Team won %d games.%n",winCount);
        System.out.printf("Team lost %d games.%n",loseCaunt);
        System.out.printf("Drawn games: %d%n",equalCaunt);
    }
}
