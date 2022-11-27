package programmingBasicsOnlineExam20and21Apri2019;

import java.util.Scanner;

public class easterGuests {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int guestCount = Integer.parseInt(scan.nextLine());
        double budget = Double.parseDouble(scan.nextLine());

        double easterBread = Math.ceil(1.0 * guestCount / 3);
        double eggs = Math.ceil(1.0 * guestCount * 2) ;

        double price = easterBread * 4.00 + eggs * 0.45 ;
        double diff = Math.abs(budget- price);
        if (budget >= price){
            System.out.printf("Lyubo bought %.0f Easter bread and %.0f eggs.%n",easterBread,eggs);
            System.out.printf("He has %.2f lv. left.",diff);
        }else {
            System.out.println("Lyubo doesn't have enough money.");
            System.out.printf("He needs %.2f lv. more.",diff );
        }

    }



}
