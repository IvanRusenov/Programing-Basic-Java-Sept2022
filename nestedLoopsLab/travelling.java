package nestedLoopsLab;

import java.util.Scanner;

public class travelling {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String destination = scan.nextLine();
        if (!destination.equals("End")){
            double minBudget = Double.parseDouble(scan.nextLine());
            double money = 0.0;
            while (!destination.equals(("End"))){
                double savings = Double.parseDouble(scan.nextLine());
                money +=savings;
                if (money >= minBudget){
                    System.out.printf("Going to %s!%n",destination);
                    money = 0;
                    destination = scan.nextLine();
                    if (destination.equals("End")){
                        break;
                    }
                    minBudget = Double.parseDouble(scan.nextLine());
                }
            }
        }

    }
}
