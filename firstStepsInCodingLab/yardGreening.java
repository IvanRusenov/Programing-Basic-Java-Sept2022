import java.util.Scanner;

public class yardGreening {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double met = Double.parseDouble(scan.nextLine());
        double sum = met * 7.61;
        double discount = sum * 0.18;
        double finalPrice = sum - discount;

        System.out.printf("The final price is: %f lv.",finalPrice);
        System.out.printf("The discount is: %f lv.",discount);



    }
}
