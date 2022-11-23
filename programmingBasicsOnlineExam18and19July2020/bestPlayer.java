package programmingBasicsOnlineExam18and19July2020;

import java.util.Scanner;

public class bestPlayer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int max = Integer.MIN_VALUE;
        String bestPlayer = "";
        boolean isHettrick = false;

        while (!name.equals("END")) {
            int goals = Integer.parseInt(scan.nextLine());
            if (goals > max) {
                max = goals;
                bestPlayer = name;
            }
            if (goals >= 10) {
                isHettrick = true;
                break;
            } else if (goals >= 3) {
                isHettrick = true;
            }
            name = scan.nextLine();
        }
        System.out.printf("%s is the best player!%n", bestPlayer);
        if (isHettrick) {
            System.out.printf("He has scored %d goals and made a hat-trick !!!", max);
        } else {
            System.out.printf("He has scored %d goals.", max);
        }

    }
}
