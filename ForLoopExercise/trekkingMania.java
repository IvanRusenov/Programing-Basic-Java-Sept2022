package ForLoopExercise;

import java.util.Scanner;

public class trekkingMania {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int groupNum = Integer.parseInt(scan.nextLine());
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;
        int totalPeople = 0;


        for (int i = 1; i <= groupNum; i++) {
            int peopleNum = Integer.parseInt(scan.nextLine());
            if (peopleNum <= 5) {
                p1 += peopleNum;
            } else if (peopleNum <= 12) {
                p2 += peopleNum;
            } else if (peopleNum <= 25) {
                p3 += peopleNum;
            } else if (peopleNum <= 40) {
                p4 += peopleNum;
            } else if (peopleNum > 40) {
                p5 += peopleNum;
            }
        }
        totalPeople = p1 + p2 + p3 + p4 + p5;
        System.out.printf("%.2f%%%n",1.00 * p1 / totalPeople * 100);
        System.out.printf("%.2f%%%n",1.00 * p2 / totalPeople * 100);
        System.out.printf("%.2f%%%n",1.00 * p3 / totalPeople * 100);
        System.out.printf("%.2f%%%n",1.00 * p4 / totalPeople * 100);
        System.out.printf("%.2f%%%n",1.00 * p5 / totalPeople * 100);
    }
}
