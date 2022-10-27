package whileLoopExercise;

import java.util.Scanner;

public class cake {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int width = Integer.parseInt(scan.nextLine());
        int length = Integer.parseInt(scan.nextLine());
        int pcsCount = width * length;
        String take = scan.nextLine();
        int pcsTaked = 0;
        int pcsLeft = pcsCount;
        while  (!(take.equals("STOP"))) {
            pcsTaked = Integer.parseInt(take);
            pcsLeft -= pcsTaked;
            if (pcsLeft <= 0){
                break;
            }
            take = scan.nextLine();
        }
        if (pcsLeft >=0){
            System.out.printf("%d pieces are left.",pcsLeft);
        }else {
            System.out.printf("No more cake left! You need %d pieces more.%n",Math.abs(pcsLeft));
        }


    }
}
