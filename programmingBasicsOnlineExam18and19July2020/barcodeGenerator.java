package programmingBasicsOnlineExam18and19July2020;

import java.util.Scanner;

public class barcodeGenerator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int start = Integer.parseInt(scan.nextLine());
        int end = Integer.parseInt(scan.nextLine());
        String resul ="";

        for (int i = start / 1000; i <= end / 1000; i++) {
            for (int j = (start / 100) % 10; j <= (end / 100) % 10; j++) {
                for (int k = (start / 10) % 10; k <= (end / 10) % 10; k++) {
                    for (int l = start % 10; l <= end % 10; l++) {
                        if (i%2 != 0 && j%2!=0&& k%2!=0&&l%2!=0){
                            resul = "" + i + j + k + l;
                            System.out.printf("%s ",resul);
                        }
                    }
                }
            }
        }
    }
}

