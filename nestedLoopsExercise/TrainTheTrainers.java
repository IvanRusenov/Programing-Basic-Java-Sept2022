package nestedLoopsExercise;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        String input = scan.nextLine();
       // double gradeCounter = 0.0;
        int nCount = 0;
        double counter = 0.0;
        while(!input.equals("Finish")){
            nCount++;
            double gradeCounter = 0.0;
            for (int i = 1; i <=n ; i++) {
                double grade = Double.parseDouble(scan.nextLine());
                gradeCounter += grade;
            }
            double  avgGrade = gradeCounter / n ;
            counter += avgGrade;

            System.out.printf("%s - %.2f.%n",input,avgGrade);
            input = scan.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.",(counter / nCount));
    }
}
