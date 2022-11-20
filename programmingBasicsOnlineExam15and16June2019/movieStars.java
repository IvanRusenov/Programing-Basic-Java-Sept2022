package programmingBasicsOnlineExam15and16June2019;

import java.util.Scanner;

public class movieStars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        String name = scan.nextLine();

        boolean isEnough = true;
        double fee = 0.0;
        while (!name.equals("ACTION")){
            if (name.length() > 15){
                fee = budget * 0.20;
                budget = budget - fee;
                if (budget <= 0){
                    isEnough=false;
                    break;
                }
            }else {
                fee = Double.parseDouble(scan.nextLine());
                budget = budget - fee;
                if (budget <= 0){
                    isEnough = false;
                    break;
                }
            }
            name = scan.nextLine();
        }
        if (isEnough){
            System.out.printf("We are left with %.2f leva.",budget);
        }else {
            System.out.printf("We need %.2f leva for our actors.",Math.abs(budget));
        }



    }
}
