package whileLoopExercise;
import java.util.Scanner;
public class walking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String steps = scan.nextLine();
        int stepCount =0;
        while (!steps.equals("Going home")) {
            stepCount += Integer.parseInt(steps);
            if (stepCount >= 10000){
                break;
            }
            steps = scan.nextLine();
            if (steps.equals("Going home")){
                steps = scan.nextLine();
                stepCount += Integer.parseInt(steps);
                break;
            }
        }
        if (steps.equals("Going home")){
            steps = scan.nextLine();
            stepCount += Integer.parseInt(steps);
        }
        int diff = Math.abs(stepCount - 10000);
        if (stepCount >= 10000){
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!",diff);
        }else {
            System.out.printf("%d more steps to reach goal.",diff);
        }
    }
}
