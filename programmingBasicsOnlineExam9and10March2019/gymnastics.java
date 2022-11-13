package programmingBasicsOnlineExam9and10March2019;

import java.util.Scanner;

public class gymnastics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String country = scan.nextLine();
        String appliance = scan.nextLine();
        double difficulty = 0.0;
        double performance = 0.0;
        double grade = 0.0;
        if (country.equals("Russia")) {
            if (appliance.equals("ribbon")) {
                difficulty = 9.100;
                performance = 9.400;
                grade = difficulty + performance;

            } else if (appliance.equals("hoop")) {
                difficulty = 9.300;
                performance = 9.800;
                grade = difficulty + performance;
            } else if (appliance.equals("rope")) {
                difficulty = 9.600;
                performance = 9.000;
                grade = difficulty + performance;
            }
        }else if (country.equals("Bulgaria")) {
            if (appliance.equals("ribbon")) {
                difficulty = 9.600;
                performance = 9.400;
                grade = difficulty + performance;
            } else if (appliance.equals("hoop")) {
                difficulty = 9.550;
                performance = 9.750;
                grade = difficulty + performance;
            } else if (appliance.equals("rope")) {
                difficulty = 9.500;
                performance = 9.400;
                grade = difficulty + performance;
            }
        }else if (country.equals("Italy")) {
                if (appliance.equals("ribbon")) {
                    difficulty = 9.200;
                    performance = 9.500;
                    grade = difficulty + performance;
                } else if (appliance.equals("hoop")) {
                    difficulty = 9.450;
                    performance = 9.350;
                    grade = difficulty + performance;
                } else if (appliance.equals("rope")) {
                    difficulty = 9.700;
                    performance = 9.150;
                    grade = difficulty + performance;
                }
        }
        System.out.printf("The team of %s get %.3f on %s.%n",country,grade,appliance);
        double percent = (20.00 - grade) / 20 * 100;
        System.out.printf("%.2f%%",percent);

    }
}
