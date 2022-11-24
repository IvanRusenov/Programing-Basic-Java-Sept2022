package programmingBasicsOnlineExam20and2Apri2019Part2;

import java.util.Scanner;

public class easterEggs05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int eggCount = Integer.parseInt(scan.nextLine());
        int countRed = 0;
        int countOrange = 0;
        int countBlue = 0;
        int countGreen = 0;
        int maxEggs = 0;
        String maxColor = "";
        for (int i = 0; i < eggCount; i++) {
            String color = scan.nextLine();
            if (color.equals("red")){
                countRed++;
                if (countRed > maxEggs){
                    maxEggs = countRed;
                    maxColor ="red";
                }
            } else if (color.equals("orange")) {
                countOrange++;
                if (countOrange > maxEggs){
                    maxEggs = countOrange;
                    maxColor ="orange";
                }
            } else if (color.equals("blue")) {
                countBlue++;
                if (countBlue > maxEggs){
                    maxEggs = countBlue;
                    maxColor ="blue";
                }
            } else if (color.equals("green")) {
                countGreen++;
                if (countGreen > maxEggs){
                    maxEggs = countGreen;
                    maxColor ="green";
                }
            }
        }
        System.out.printf("Red eggs: %d\n",countRed);
        System.out.printf("Orange eggs: %d\n",countOrange);
        System.out.printf("Blue eggs: %d\n",countBlue);
        System.out.printf("Green eggs: %d\n",countGreen);
        System.out.printf("Max eggs: %d -> %s\n",maxEggs,maxColor);
    }
}
