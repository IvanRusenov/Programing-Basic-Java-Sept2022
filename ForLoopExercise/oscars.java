package ForLoopExercise;

import java.util.Scanner;

public class oscars {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        double points = Double.parseDouble(scan.nextLine());
        int judges = Integer.parseInt(scan.nextLine());
        String judgeName = "";
        double judgePoints = 0.0;

        for (int i = 1; i <=judges ; i++) {
            judgeName =scan.nextLine();
            judgePoints = Double.parseDouble(scan.nextLine());

            points += judgeName.length() * judgePoints / 2;

            if (points >= 1250.50){
                break;
            }
        }
        double diff = Math.abs(points - 1250.50);
        if (points >= 1250.50){
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!",name , points);
        }else {
            System.out.printf("Sorry, %s you need %.1f more!",name,diff);
        }
    }
}
