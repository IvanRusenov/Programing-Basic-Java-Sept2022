import java.util.Scanner;

public class petShop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int dogFood = Integer.parseInt(scan.nextLine());
        int catFood = Integer.parseInt(scan.nextLine());

        double  price = catFood * 4 + dogFood * 2.5;

        System.out.printf("%f lv.",price);


    }
}
