package conditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class hotelRoom {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String month = scan.nextLine();
        int nightCount = Integer.parseInt(scan.nextLine());
        double studioPrice = 0.0;
        double apartmentPrice = 0.0;
//        switch (month) {
//            case "May":
//            case "October":
//                studioPrice = nightCount * 50.0;
//                apartmentPrice = nightCount * 65.0;
//                if (nightCount > 7 && nightCount <= 14) {
//                    studioPrice = studioPrice * 0.9;
//                } else if (nightCount > 14) {
//                    studioPrice = studioPrice * 0.7;
//                }
//                break;
//            case "June":
//            case "September":
//                studioPrice = nightCount * 75.20;
//                apartmentPrice = nightCount * 68.70;
//                if (nightCount > 14) {
//                    studioPrice = studioPrice * 0.8;
//                }
//                break;
//            case "July":
//            case "August":
//                studioPrice = nightCount * 76.0;
//                apartmentPrice = nightCount * 77.0;
//                break;
//            default:
//                break;
//        }

        if (month.equals("May") || month.equals("October")) {
            studioPrice = nightCount * 50.0;
            apartmentPrice = nightCount * 65.0;
            if (nightCount > 7 && nightCount <= 14) {
                studioPrice = studioPrice * 0.95;
            } else if (nightCount > 14) {
                studioPrice = studioPrice * 0.7;
            }
        } else if (month.equals("June") || month.equals("September")) {
            studioPrice = nightCount * 75.20;
            apartmentPrice = nightCount * 68.70;
            if (nightCount > 14) {
                studioPrice = studioPrice * 0.8;
            }
        } else if (month.equals("July") || month.equals("August")) {
            studioPrice = nightCount * 76.0;
            apartmentPrice = nightCount * 77.0;
        }

        if (nightCount > 14) {
            apartmentPrice = apartmentPrice * 0.90;
        }
        System.out.printf("Apartment: %.2f lv.%n", apartmentPrice);
        System.out.printf("Studio: %.2f lv.", studioPrice);


    }
}
