package programmingBasicOnlineExam6and7July2019;

import java.util.Scanner;

public class renovation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int height = Integer.parseInt(scan.nextLine());
        int width  = Integer.parseInt(scan.nextLine());
        int percent = Integer.parseInt(scan.nextLine());
        String litersPaint = scan.nextLine();
        boolean isPainted = false;
        int area = height * width * 4;
        double totalArea = Math.ceil(area - (area * (1.0 * percent/100)));

        while  (!litersPaint.equals("Tired!")){
            int liters = Integer.parseInt(litersPaint);
            totalArea -= liters;
            if (totalArea < 0){
                System.out.printf("All walls are painted and you have %.0f l paint left!",Math.abs(totalArea));
                isPainted = true;
                break;
            } else if (totalArea == 0) {
                System.out.println("All walls are painted! Great job, Pesho!");
                isPainted = true;
                break;
            }
            litersPaint =scan.nextLine();
        }
        if (!isPainted){
            System.out.printf("%.0f quadratic m left.",totalArea);
        }
    }
}
