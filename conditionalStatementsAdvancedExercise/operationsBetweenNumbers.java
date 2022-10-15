package conditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class operationsBetweenNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        String operator = scan.nextLine();



//        switch (operator) {
//            case "+":
//                int result = num1 + num2;
//                if (result % 2 == 0) {
//                    System.out.printf("%d %s %d = %d – even", num1, operator, num2, result);
//                } else {
//                    System.out.printf("%d %s %d = %d – odd", num1, operator, num2, result);
//                }
//                break;
//            case "-":
//               result = num1 - num2;
//                if (result % 2 == 0) {
//                    System.out.printf("%d %s %d = %d – even", num1, operator, num2, result);
//                } else {
//                    System.out.printf("%d %s %d = %d – odd", num1, operator, num2, result);
//                }
//                break;
//            case "*":
//                result = num1 * num2;
//                if (result % 2 == 0) {
//                    System.out.printf("%d %s %d = %.0f – even", num1, operator, num2, result);
//                } else {
//                    System.out.printf("%d %s %d = %.0f – odd", num1, operator, num2, result);
//                }
//                break;
//            case "/":
//                if (num2 != 0) {
//                    result = num1 * 1.0 / num2;
//                    System.out.printf("%d / %d = %.2f", num1, num2, result);
//                } else {
//                    System.out.printf("Cannot divide %d by zero", num1);
//                }
//                break;
//            case "%":
//                if (num2 != 0) {
//                    result = num1 % num2;
//                    System.out.printf("%d %% %d = %.0f", num1, num2, result);
//                } else {
//                    System.out.printf("Cannot divide %d by zero", num1);
//                }
//                break;
//
//        }
            if (operator.equals("+")) {
                int result = num1 + num2;
                if (result % 2 == 0) {
                    System.out.printf("%d %s %d = %d - even", num1, operator, num2, result);
                } else {
                    System.out.printf("%d %s %d = %d - odd", num1, operator, num2, result);
                }
            }else if (operator.equals("-")){
                int result = num1 - num2;
                if (result % 2 == 0) {
                    System.out.printf("%d %s %d = %d - even", num1, operator, num2, result);
                } else {
                    System.out.printf("%d %s %d = %d - odd", num1, operator, num2, result);
                }
            }else if (operator.equals("*")){
               int  result = num1 * num2;
                if (result % 2 == 0) {
                    System.out.printf("%d %s %d = %d - even", num1, operator, num2, result);
                } else {
                    System.out.printf("%d %s %d = %d - odd", num1, operator, num2, result);
                }
            }else if (operator.equals("/")){
                if (num2 != 0) {
                    double result = num1 * 1.0 / num2;
                    System.out.printf("%d / %d = %.2f", num1, num2, result);
                } else {
                    System.out.printf("Cannot divide %d by zero", num1);
                }
            }else if (operator.equals("%")){
                if (num2 != 0) {
                    double result = num1 % num2;
                    System.out.printf("%d %% %d = %.0f", num1, num2, result);
                } else {
                    System.out.printf("Cannot divide %d by zero", num1);
                }
            }

    }
}
