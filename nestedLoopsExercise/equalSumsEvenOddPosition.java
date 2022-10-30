import java.util.Scanner;

public class equalSumsEvenOddPosition {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n1 =Integer.parseInt(scan.nextLine());
        int n2 = Integer.parseInt(scan.nextLine());

        for (int i = n1; i <=n2 ; i++) {
            int sumEven = 0;
            int sumOdd = 0;
            String currentNum = "" + i;//cast to string
            for (int j = 0; j < currentNum.length(); j++) {
                int digit = Integer.parseInt("" + currentNum.charAt(j));//cast char to string
                if (j % 2 == 0){
                    sumEven += digit;
                }else {
                    sumOdd += digit;
                }
            }
            if (sumEven == sumOdd){
                System.out.printf("%d ",i);
            }
        }
    }
}