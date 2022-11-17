package programmingBasicsOnlineExam15and16June2019;

import java.util.Scanner;

public class movieDay {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int shootingTime = Integer.parseInt(scan.nextLine());
        int sceneCount = Integer.parseInt(scan.nextLine());
        int timeFor1Scene = Integer.parseInt(scan.nextLine());

        double prepareTerrain = shootingTime * 0.15;
        double time = sceneCount * timeFor1Scene + prepareTerrain;
        double diff = Math.abs(shootingTime - time);
        if (shootingTime >= time){
            System.out.printf("You managed to finish the movie on time! You have %.0f minutes left!",diff);
        }else {
            System.out.printf("Time is up! To complete the movie you need %.0f minutes.",diff);
        }
    }
}
