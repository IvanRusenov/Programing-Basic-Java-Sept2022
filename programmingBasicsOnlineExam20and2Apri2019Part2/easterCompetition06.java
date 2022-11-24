package programmingBasicsOnlineExam20and2Apri2019Part2;

import java.util.Scanner;

public class easterCompetition06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       int breadsCount = Integer.parseInt(scan.nextLine());

       int maxGrade = Integer.MIN_VALUE;
       String bestBaker = "";

        for (int i = 0; i < breadsCount; i++) {
            String name = scan.nextLine();
            String command =scan.nextLine();;
            int totalGrage  = 0;
            while (!command.equals("Stop")){
                int grade = Integer.parseInt(command);
                totalGrage += grade;
                command = scan.nextLine();
            }
            System.out.printf("%s has %d points.\n",name,totalGrage);
            if (totalGrage > maxGrade){
                maxGrade = totalGrage;
                bestBaker = name;
                System.out.printf("%s is the new number 1!\n",bestBaker);
            }

        }
        System.out.printf("%s won competition with %d points!\n",bestBaker,maxGrade);
    }
}
