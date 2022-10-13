package ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class fruitShope {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String fruit = scan.nextLine();
        String day = scan.nextLine();
        double quantity = Double.parseDouble(scan.nextLine());

        double price = 0;

        switch (day) {
            case "Sunday":
            case "Saturday":
                switch (fruit) {
                    case "banana":
                        price = quantity * 2.70;
                        System.out.printf("%.2f",price);
                        break;
                    case "apple":
                        price = quantity * 1.25;
                        System.out.printf("%.2f",price);
                        break;
                    case "orange":
                        price = quantity * 0.90;
                        System.out.printf("%.2f",price);
                        break;
                    case "grapefruit":
                        price = quantity * 1.60;
                        System.out.printf("%.2f",price);
                        break;
                    case "kiwi":
                        price = quantity * 3.00;
                        System.out.printf("%.2f",price);
                        break;
                    case "pineapple":
                        price = quantity * 5.60;
                        System.out.printf("%.2f",price);
                        break;
                    case "grapes":
                        price = quantity * 4.20;
                        System.out.printf("%.2f",price);
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
                break;
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                switch (fruit) {
                    case "banana":
                        price = quantity * 2.50;
                        System.out.printf("%.2f",price);
                        break;
                    case "apple":
                        price = quantity * 1.20;
                        System.out.printf("%.2f",price);
                        break;
                    case "orange":
                        price = quantity * 0.85;
                        System.out.printf("%.2f",price);
                        break;
                    case "grapefruit":
                        price = quantity * 1.45;
                        System.out.printf("%.2f",price);
                        break;
                    case "kiwi":
                        price = quantity * 2.70;
                        System.out.printf("%.2f",price);
                        break;
                    case "pineapple":
                        price = quantity * 5.50;
                        System.out.printf("%.2f",price);
                        break;
                    case "grapes":
                        price = quantity * 3.85;
                        System.out.printf("%.2f",price);
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
                break;
            default:
                System.out.println("error");
                break;

        }


    }
}