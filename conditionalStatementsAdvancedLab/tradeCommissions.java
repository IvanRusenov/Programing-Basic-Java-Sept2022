package ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class tradeCommissions {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String town = scan.nextLine();

        double sells = Double.parseDouble(scan.nextLine());
        double comission = 0.0;
        boolean isValid = true;

        if (town.equals("Sofia")){
            if (sells >= 0 && sells <= 500){
                comission = sells * 5 /100;

            } else if (sells > 500 && sells <= 1000) {
                comission = sells * 7 /100;
                
            }else if (sells > 1000 && sells <= 10000) {
                comission = sells * 8 /100;

            }else if (sells > 10000 ) {
                comission = sells * 12 /100;
            }else {
                isValid = false;
            }
        }else if (town.equals("Varna")){
            if (sells >= 0 && sells <= 500){
                comission = sells * 4.5 /100;

            } else if (sells > 500 && sells <= 1000) {
                comission = sells * 7.5 /100;

            }else if (sells > 1000 && sells <= 10000) {
                comission = sells * 10 /100;

            }else if (sells > 10000 ) {
                comission = sells * 13 /100;
            }else {
                isValid = false;
            }

        }else if (town.equals("Plovdiv")){
            if (sells >= 0 && sells <= 500){
                comission = sells * 5.5 /100;

            } else if (sells > 500 && sells <= 1000) {
                comission = sells * 8 /100;

            }else if (sells > 1000 && sells <= 10000) {
                comission = sells * 12 /100;

            }else if (sells > 10000 ) {
                comission = sells * 14.5 /100;
            }else {
                isValid = false;
            }

        }else {
            isValid = false;
        }


        if (isValid == true){
            System.out.printf("%.2f",comission);
        }else{
            System.out.println("error");
        }


    }

}
