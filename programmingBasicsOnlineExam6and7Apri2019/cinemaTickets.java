package programmingBasicsOnlineExam6and7Apri2019;

import java.util.Scanner;

public class cinemaTickets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int countStu =0;
        int countSta =0;
        int countKid =0;
        int totalTickets =0;
        int totalCount =0;
        double percentFull = 0.0;
        boolean isFull = false;
        int totalCountStu =0;
        int totalCountSta =0;
        int totalCountKid =0;

        String name = scan.nextLine();

        while (!name.equals("Finish")){
            int freeSeats = Integer.parseInt(scan.nextLine());
            totalCount =0;
            countStu =0;
            countSta =0;
            countKid =0;
            String type =scan.nextLine();

            while (!type.equals("End")){


                if (type.equals("student")){
                    countStu++;
                }else if (type.equals("standard")){
                    countSta++;
                }else if (type.equals("kid")){
                    countKid++;
                }

                totalCount++;
                totalTickets ++;

                if (totalCount >= freeSeats){
                    break;
                }

                type=scan.nextLine();
            }
            totalCountStu += countStu;
            totalCountSta += countSta;
            totalCountKid += countKid;
            percentFull = 1.0 * totalCount / freeSeats * 100 ;
            System.out.printf("%s - %.2f%% full.%n",name,percentFull);

            name =scan.nextLine();
        }
        System.out.printf("Total tickets: %d%n",totalTickets);
        System.out.printf("%.2f%% student tickets.%n",1.0 * totalCountStu / totalTickets * 100);
        System.out.printf("%.2f%% standard tickets.%n",1.0 * totalCountSta / totalTickets *100);
        System.out.printf("%.2f%% kids tickets.%n",1.0 * totalCountKid / totalTickets * 100);
    }
}
