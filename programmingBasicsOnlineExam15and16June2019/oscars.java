package programmingBasicsOnlineExam15and16June2019;

import java.util.Scanner;

public class oscars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        double point = Double.parseDouble(scan.nextLine());
        int n = Integer.parseInt(scan.nextLine());
        boolean isNomination = false;

        for (int i = 0; i < n ; i++) {
            String juriName = scan.nextLine();
            double juriPoints = Double.parseDouble(scan.nextLine());
            point += juriName.length() * juriPoints /2;
            if (point >= 1250.5 ){
                isNomination =true;
                break;
            }
        }
        if (isNomination){
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!",name,point);
        }else {
            System.out.printf("Sorry, %s you need %.1f more!",name,1250.50 - point);
        }


    }
}
