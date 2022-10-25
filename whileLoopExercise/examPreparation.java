package whileLoopExercise;

import java.util.Scanner;

public class examPreparation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int badGrades = Integer.parseInt(scan.nextLine());
        String task = scan.nextLine();
        int grade = Integer.parseInt(scan.nextLine());
        int count = 0;
        int sumGrades = 0;
        int badGrade =0;
        String lastTask ="";
        while (!task.equals("Enough")){
            lastTask = task;
            count++;
            if (grade<=4){
                badGrade++;
                if (badGrade >= badGrades){
                    break;
                }
            }
            sumGrades += grade;
            task = scan.nextLine();
            if (task.equals("Enough")){
                break;
            }
            grade = Integer.parseInt(scan.nextLine());
        }
        double average = Math.abs(1.0 * sumGrades / count);
        if (badGrade>=badGrades){
            System.out.printf("You need a break, %d poor grades.",badGrade);
        }else {
            System.out.printf("Average score: %.2f%n",average);
            System.out.printf("Number of problems: %d%n",count);
            System.out.printf("Last problem: %s%n",lastTask);
        }
    }
}
