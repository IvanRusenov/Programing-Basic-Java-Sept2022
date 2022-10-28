package nestedLoopsLab;

import java.util.Scanner;

public class sumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int start = Integer.parseInt(scan.nextLine());
        int end = Integer.parseInt(scan.nextLine());
        int magNum = Integer.parseInt(scan.nextLine());
        int counter =0;
        int magCounter =0;

        for (int i = start; i <=end ; i++) {
            if (magCounter == 0){
                for (int j = start; j <=end ; j++) {
                    counter++;
                    if (i+j == magNum){
                        magCounter++;
                        System.out.printf("Combination N:%d (%d + %d = %d)%n",counter,i,j,magNum);
                        break;
                    }
                }
            }else {
                break;
            }
        }if (magCounter == 0){
            System.out.printf("%d combinations - neither equals %d",counter,magNum);
        }

    }
}
