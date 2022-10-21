package ForLoopExercise;

import java.util.Scanner;

public class salary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tabs = Integer.parseInt(scan.nextLine());
        int salary = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <=tabs ; i++) {
            String site = scan.nextLine();
            if (site.equals("Facebook")){
                salary = salary - 150;
            } else if (site.equals("Instagram")) {
                salary = salary - 100;
            } else if (site.equals("Reddit")) {
                salary = salary - 50;
            }

            if (salary <= 0){
                break;
            }
        }
        if (salary <= 0){
            System.out.printf("You have lost your salary.");
        }else{
            System.out.println(salary);
        }


    }
}
