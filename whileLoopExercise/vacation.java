package whileLoopExercise;

import java.util.Scanner;

public class vacation {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double tripPrice = Double.parseDouble(scan.nextLine());
        double money = Double.parseDouble(scan.nextLine());
        String action =scan.nextLine();
        double spentMoney = Double.parseDouble(scan.nextLine());
        int spendCounter =0;
        int daysCounter =0;

        while (money <= tripPrice) {
            daysCounter++;
            if (action.equals("spend")){
                money -= spentMoney;
                spendCounter ++;
                if (money < 0){
                    money = 0;
                }
            }else {
                money +=spentMoney;
                spendCounter = 0;
            }
            if (spendCounter == 5){
                break;
            }
            if (money>=tripPrice){
                break;
            }
            action = scan.nextLine();
            spentMoney = Double.parseDouble(scan.nextLine());
        }
        if (spendCounter == 5){
            System.out.println("You can't save the money.");
            System.out.println(daysCounter);
        }
        if (money>=tripPrice){
            System.out.printf("You saved the money for %d days.",daysCounter);
        }
    }
}
