package ForLoopExercise;

import java.util.Scanner;

public class cleverLily {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int age = Integer.parseInt(scan.nextLine());
        double washPrice = Double.parseDouble(scan.nextLine());
        int toyPrice = Integer.parseInt(scan.nextLine());

        int toysCount = 0;
        int moneyCount = 0;
        double toysPrice =0.0;

        for (int i = 1; i <=age ; i++) {
            if (i%2!=0){
                toysCount++;
            }else {
                moneyCount += i * 5 - 1;
            }
        }
        toysPrice = toysCount * toyPrice;
        double totalMoney = moneyCount + toysPrice;
        double diff = Math.abs(totalMoney - washPrice);

        if (totalMoney >= washPrice){
            System.out.printf("Yes! %.2f",diff);
        }else {
            System.out.printf("No! %.2f",diff);
        }

    }
}
