import java.util.Scanner;

public class inchesToSantimeters {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        double num = Double.parseDouble(scan.nextLine());

        double result = num * 2.54;

        System.out.println(result);
    }
}
