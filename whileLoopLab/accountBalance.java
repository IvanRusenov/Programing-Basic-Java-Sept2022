package whileLoopLab;

import java.util.Scanner;

public class accountBalance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String command = scan.nextLine();
        double sum = 0.0;

        while(!(command.equals("NoMoreMoney"))){
           double input = Double.parseDouble(command);
           if (input<0){
               System.out.println("Invalid operation!");
               break;
           }else {
               System.out.printf("Increase: %.2f%n",input);
               sum += input;
           }
            command = scan.nextLine();

        }
        System.out.printf("Total: %.2f%n",sum);
    }
}
