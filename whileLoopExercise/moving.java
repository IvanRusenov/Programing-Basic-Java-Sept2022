package whileLoopExercise;

import java.util.Scanner;

public class moving {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int width = Integer.parseInt(scan.nextLine());
        int length = Integer.parseInt(scan.nextLine());
        int height = Integer.parseInt(scan.nextLine());

        int totalSpace = width * length * height;
        int left = totalSpace;
        String moved = scan.nextLine();

        while (!moved.equals("Done")) {
            left -= Integer.parseInt(moved);
            if (left <= 0){
                break;
            }
            moved = scan.nextLine();
        }
        if (left > 0){
            System.out.printf("%d Cubic meters left.",left);
        }else {
            System.out.printf("No more free space! You need %d Cubic meters more.",Math.abs(left));
        }
    }
}
