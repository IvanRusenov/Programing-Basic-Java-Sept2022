package forLoopLab;

import java.util.Scanner;

public class characterSequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        int lenght = text.length();
        for (int i = 0; i < lenght; i++){
            System.out.println(text.charAt(i));
        }
    }
}
