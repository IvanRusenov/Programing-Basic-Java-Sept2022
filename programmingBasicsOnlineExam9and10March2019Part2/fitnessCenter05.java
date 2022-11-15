package programmingBasicsOnlineExam9and10March2019Part2;

import java.util.Scanner;

public class fitnessCenter05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int clientsCount = Integer.parseInt(scan.nextLine());

        int countback = 0;
        int countchest = 0;
        int countlegs = 0;
        int countabs = 0;
        int countShake = 0;
        int countBar = 0;
        int countProtein = 0;
        int countWorOut = 0;

        for (int i = 0; i < clientsCount; i++) {
            String buy = scan.nextLine();
            if (buy.equals("Back")) {
                countback++;
                countWorOut++;
            } else if (buy.equals("Chest")) {
                countchest++;
                countWorOut++;
            } else if (buy.equals("Legs")) {
                countlegs++;
                countWorOut++;
            } else if (buy.equals("Abs")) {
                countabs++;
                countWorOut++;
            } else if (buy.equals("Protein shake")) {
                countShake++;
                countProtein++;
            } else if (buy.equals("Protein bar")) {
                countBar++;
                countProtein++;
            }
        }
        System.out.printf("%d - back\n",countback);
        System.out.printf("%d - chest\n",countchest);
        System.out.printf("%d - legs\n",countlegs);
        System.out.printf("%d - abs\n",countabs);
        System.out.printf("%d - protein shake\n",countShake);
        System.out.printf("%d - protein bar\n",countBar);

        double percentWorkOut = 1.0 * countWorOut / clientsCount * 100;
        System.out.printf("%.2f%% - work out\n",percentWorkOut);
        double percentProtein = 1.0 * countProtein / clientsCount * 100;
        System.out.printf("%.2f%% - protein\n",percentProtein);

    }
}
