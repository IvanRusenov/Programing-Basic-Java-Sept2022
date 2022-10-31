package nestedLoopsExercise;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();

        int totalCount = 0;
        double avg = 0.0;
        int totalStudents = 0;
        int totalKid = 0;
        int totalStandard = 0;
        int freeSeats = 0;


        while (!name.equals("Finish")) {
            freeSeats = Integer.parseInt(scan.nextLine());
            String type = scan.nextLine();
            int standartCount = 0;
            int kidCount = 0;
            int stuCount = 0;

            while (!type.equals("End")) {
                if (type.equals("standard")) {
                    standartCount++;
                } else if (type.equals("kid")) {
                    kidCount++;
                } else if (type.equals("student")) {
                    stuCount++;
                }
                if (stuCount + standartCount + kidCount >= freeSeats) {
                   // System.out.printf("%s - 100.00%% full.%n", name);
                    break;
                }
                type = scan.nextLine();
            }
            totalStandard += standartCount;
            totalKid += kidCount;
            totalStudents += stuCount;
            avg = 1.0 * (stuCount + standartCount + kidCount) / freeSeats * 100;
            System.out.printf("%s - %.2f%% full.%n", name, avg);
            totalCount = totalStudents + totalKid + totalStandard;
            name = scan.nextLine();
        }
        double avgStudents = 1.0 * totalStudents / totalCount * 100;
        double avgStandard = 1.0 * totalStandard / totalCount * 100;
        double avgKid = 1.0 * totalKid / totalCount * 100;

        System.out.printf("Total tickets: %d%n", totalCount);
        System.out.printf("%.2f%% student tickets.%n", avgStudents);
        System.out.printf("%.2f%% standard tickets.%n", avgStandard);
        System.out.printf("%.2f%% kids tickets.%n", avgKid);
    }
}
