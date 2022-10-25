package whileLoopLab;

import java.util.Scanner;

public class graduation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        double grades = 0.0;
        int clas = 1;
        int fail = 0;
        double sumGrades =0.0;
        while (clas <= 12){
            grades = Double.parseDouble(scan.nextLine());

            if (grades>=4){
                clas++;

            }else {
                fail++;
                if (fail>1){
                    break;
                }
                continue;
            }
            sumGrades +=grades;
        }
        if (fail>1){
            System.out.printf("%s has been excluded at %d grade",name,clas);

        }else {
            double averageGrade = sumGrades / 12;
            System.out.printf("%s graduated. Average grade: %.2f",name,averageGrade);
        }


    }
}
