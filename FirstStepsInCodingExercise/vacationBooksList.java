package FirstStepsInCodingExercise;

import java.util.Scanner;

public interface vacationBooksList {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int pagesCount = Integer.parseInt(scan.nextLine());
        int pagesPerHour = Integer.parseInt(scan.nextLine());
        int days = Integer.parseInt(scan.nextLine());

        int timeToRead = pagesCount / pagesPerHour;
        int neededDays = timeToRead / days;

        System.out.println(neededDays);


    }
}
