package programmingBasicsOnlinePreExam22and23October2022;

import java.util.Scanner;

public class substitute {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = Integer.parseInt(scan.nextLine());
        int l = Integer.parseInt(scan.nextLine());
        int m = Integer.parseInt(scan.nextLine());
        int n = Integer.parseInt(scan.nextLine());
        String player1 = "";
        String player2 = "";
        int count = 0;
        for (int i = k; i <= 8; i++) {
            for (int j = 9; j >= l; j--) {
                for (int o = m; o <= 8; o++) {
                    for (int p = 9; p >= n; p--) {
                        if (i % 2 == 0 && j % 2 != 0 && o % 2 == 0 && p % 2 != 0) {
                            if (count > 5) {
                                return;
                            }
                            player1 = "" + i + j;
                            player2 = "" + o + p;
                            if (!player1.equals(player2)) {
                                System.out.printf("%s%s - %s%s\n", i, j, o, p);
                                count++;
                            } else {
                                System.out.println("Cannot change the same player.");
                            }
                        }
                    }
                }
            }
        }
    }
}
