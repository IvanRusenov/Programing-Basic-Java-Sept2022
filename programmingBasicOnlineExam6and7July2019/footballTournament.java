package programmingBasicOnlineExam6and7July2019;

import java.util.Scanner;

public class footballTournament {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        int countMaches = Integer.parseInt(scan.nextLine());
        int countW =0;
        int countsD =0;
        int countL =0;
        double winRate =0.0;
        int points =0;

        if (countMaches == 0){
            System.out.printf("%s hasn't played any games during this season.",name);
        }else{
            for (int i = 1; i <= countMaches ; i++) {
                String result = scan.nextLine();
                if (result.equals("W")){
                    points +=3;
                    countW++;
                } else if (result.equals("D")) {
                    points += 1;
                    countsD++;
                } else if (result.equals("L")) {
                    countL++;
                }
            }
            winRate = 1.0 * countW / countMaches * 100;
            System.out.printf("%s has won %d points during this season.%n",name,points);
            System.out.println("Total stats:");
            System.out.printf("## W: %d%n",countW);
            System.out.printf("## D: %d%n",countsD);
            System.out.printf("## L: %d%n",countL);
            System.out.printf("Win rate: %.2f%%",winRate);
        }
    }
}
