package forLoopLab;

import java.util.Scanner;

public class vowelsSum {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();
        int sum = 0;

        for (int i=0; i<text.length(); i++){
            char letter = text.charAt(i);
            if (letter == 'a'){
                sum += 1;
            }else if (letter == 'e'){
                sum += 2;
            } else if (letter == 'i') {
                sum += 3;
            } else if (letter == 'o') {
                sum += 4;
            } else if (letter=='u') {
                sum += 5;
            }

        }
        System.out.println(sum);


    }
}
