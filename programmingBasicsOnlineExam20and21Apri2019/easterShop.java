package programmingBasicsOnlineExam20and21Apri2019;

import java.util.Scanner;

public class easterShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int eggNum = Integer.parseInt(scan.nextLine());
        String input = scan.nextLine();
        int eggsSold =0;
        while (!input.equals("Close")){
            int count = Integer.parseInt(scan.nextLine());
            if (input.equals("Buy")){
                eggNum -= count;
                eggsSold += count;

            }else {
                eggNum += count;
            }
            if (eggNum<0){
                System.out.println("Not enough eggs in store!");
                System.out.printf("You can buy only %d.",count + eggNum);
                break;
            }
            input = scan.nextLine();
        }
        if (input.equals("Close") || eggNum == 0){
            System.out.println("Store is closed!");
            System.out.printf("%d eggs sold.",eggsSold);
        }

    }
}
