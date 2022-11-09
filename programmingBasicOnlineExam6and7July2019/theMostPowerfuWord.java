package programmingBasicOnlineExam6and7July2019;

import java.util.Scanner;

public class theMostPowerfuWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        int sum = 0;

        int finalSum = 0;
        String strongestWord = "";
        int maxSum = Integer.MIN_VALUE;

        while (!input.equals("End of words")) {
            char firstLetter = input.charAt(0);
            sum = 0;
            for (int i = 0; i < input.length(); i++) {
                char letter = input.charAt(i);
                sum += letter;
            }
            if (firstLetter == 'a'
                    || firstLetter == 'e'
                    || firstLetter == 'i'
                    || firstLetter == 'o'
                    || firstLetter == 'u'
                    || firstLetter == 'y'
                    || firstLetter == 'A'
                    || firstLetter == 'E'
                    || firstLetter == 'I'
                    || firstLetter == 'O'
                    || firstLetter == 'U'
                    || firstLetter == 'Y') {

                finalSum = sum * input.length();

            } else {
                finalSum = Math.floorDiv(sum,input.length());
            }
            if (finalSum > maxSum) {
                maxSum = finalSum;
                strongestWord = input;
            }

            input = scan.nextLine();
        }
        System.out.printf("The most powerful word is %s - %d", strongestWord, maxSum);
    }
}
