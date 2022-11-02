package conditionalStatementsAdvancedMooreExercise;

import java.util.Scanner;

public class schoolCamp {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

        String season = scan.nextLine();
        String groupType = scan.nextLine();
        int scoolsCount = Integer.parseInt(scan.nextLine());
        int nightsCount = Integer.parseInt(scan.nextLine());
        double nightsPrice = 0.0;
        double price = 0.0;
        String sport = " ";

        if (season.equals("Winter")){
            if (groupType.equals("mixed")){
                nightsPrice = 10.00;
            }else {
                nightsPrice = 9.60;
            }
        }else if (season.equals("Spring")){
            if (groupType.equals("mixed")){
                nightsPrice = 9.50;
            }else {
                nightsPrice = 7.20;
            }
        } else if (season.equals("Summer")) {
            if (groupType.equals("mixed")){
                nightsPrice = 20.00;
            }else {
                nightsPrice = 15.00;
            }
        }
        price = nightsPrice * nightsCount * scoolsCount;

        if (scoolsCount >= 50){
            price = price * 0.50;
        }else if (scoolsCount >=20){
            price = price * 0.85;
        } else if (scoolsCount >= 10) {
            price = price * 0.95;
        }
        if (season.equals("Winter")){
            if (groupType.equals("girls")){
                sport = "Gymnastics";
            } else if (groupType.equals("boys")) {
                sport = "Judo";
            } else if (groupType.equals("mixed")) {
                sport ="Ski";
            }
        }else if (season.equals("Spring")){
            if (groupType.equals("girls")){
                sport = "Athletics";
            } else if (groupType.equals("boys")) {
                sport = "Tennis";
            } else if (groupType.equals("mixed")) {
                sport ="Cycling";
            }
        }else if (season.equals("Summer")) {
            if (groupType.equals("girls")) {
                sport = "Volleyball";
            } else if (groupType.equals("boys")) {
                sport = "Football";
            } else if (groupType.equals("mixed")) {
                sport = "Swimming";
            }
        }
        System.out.printf("%s %.2f lv.",sport,price);
    }
}
