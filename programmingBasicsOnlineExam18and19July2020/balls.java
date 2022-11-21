package programmingBasicsOnlineExam18and19July2020;

import java.util.Scanner;

public class balls {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int point = 0;
        int red =0;
        int orange  = 0;
        int yellow =0;
        int white =0;
        int black =0;
        int difrend =0;
        int toalCount =0;




        for (int i = 0; i < n; i++) {
            String colors = scan.nextLine();
            if (colors.equals("red")){
                point += 5;
                red++;
            } else if (colors.equals("orange")) {
                point += 10;
                orange++;
            }else if (colors.equals("yellow")) {
                point += 15;
                yellow++;
            }else if (colors.equals("white")) {
                point += 20;
                white++;
            }else if (colors.equals("black")) {
                point /= 2;
                black++;
            }else{
                difrend++;
            }

        }
        toalCount = red + orange + yellow + white + black + difrend;
        System.out.printf("Total points: %d%n",point);
        System.out.printf("Red balls: %d%n",red);
        System.out.printf("Orange balls: %d%n",orange);
        System.out.printf("Yellow balls: %d%n",yellow);
        System.out.printf("White balls: %d%n",white);
        System.out.printf("Other colors picked: %d%n",difrend);
        System.out.printf("Divides from black balls: %d%n",black);
    }
}
