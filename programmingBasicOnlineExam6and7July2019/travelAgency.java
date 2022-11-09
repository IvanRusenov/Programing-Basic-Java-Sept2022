package programmingBasicOnlineExam6and7July2019;

import java.util.Scanner;

public class travelAgency {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String town = scan.nextLine();
        String pacageType = scan.nextLine();
        String vip = scan.nextLine();
        int days = Integer.parseInt(scan.nextLine());
        double price = 0.0;
        boolean isValidData = true;

        if (days > 7) {
            days -= 1;
        }
        if (days < 1) {
            System.out.println("Days must be positive number!");
        } else {
            if (town.equals("Bansko") || town.equals("Borovets")) {
                if (pacageType.equals("withEquipment")) {
                    price = days * 100;
                    if (vip.equals("yes")) {
                        price *= 0.90;
                    }
                } else if (pacageType.equals("noEquipment")) {
                    price = days * 80;
                    if (vip.equals("yes")) {
                        price *= 0.95;
                    }
                } else {
                    System.out.println("Invalid input!");
                    isValidData = false;
                }
            } else if (town.equals("Varna") || town.equals("Burgas")) {
                if (pacageType.equals("withBreakfast")) {
                    price = days * 130;
                    if (vip.equals("yes")) {
                        price *= 0.88;
                    }
                } else if (pacageType.equals("noBreakfast")) {
                    price = days * 100;
                    if (vip.equals("yes")) {
                        price *= 0.93;
                    }
                } else {
                    System.out.println("Invalid input!");
                    isValidData = false;
                }
            } else {
                System.out.println("Invalid input!");
                isValidData = false;
            }
            if (isValidData) {
                System.out.printf("The price is %.2flv! Have a nice time!", price);
            }
        }
    }
}
