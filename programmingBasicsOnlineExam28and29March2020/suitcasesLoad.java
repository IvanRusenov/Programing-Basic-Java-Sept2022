package programmingBasicsOnlineExam28and29March2020;

import java.util.Scanner;

public class suitcasesLoad {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String capacity = scan.nextLine();
        double maxVolume = Double.parseDouble(capacity);
        int count = 1;
        String volume = scan.nextLine();
        boolean isFull = false;
        while(!volume.equals("End")){
            double numVolume = Double.parseDouble(volume);

            if (count % 3 == 0){
                numVolume = numVolume * 1.10;
            }
            maxVolume -= numVolume;

            if (maxVolume<=0){
                isFull = true;
                break;
            }
            count++;
            volume = scan.nextLine();
        }
        if (isFull){
            System.out.println("No more space!");
        }else {
            System.out.printf("Congratulations! All suitcases are loaded!%n");
        }
        System.out.printf("Statistic: %d suitcases loaded.",count-1);
    }
}
