package programmingBasicsOnlineExam6and7Apri2019;

import java.util.Scanner;

public class movieRatings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        double maxRating = Double.MIN_VALUE;
        double minRating = Double.MAX_VALUE;
        double avgRating = 0.0;
        double counter = 0.0;
        String maxratingName = "";
        String minratingName = "";
        for (int i = 1; i <=n ; i++) {
            String name = scan.nextLine();
            double rating = Double.parseDouble(scan.nextLine());
            if (rating>maxRating){
                maxRating = rating;
                maxratingName =name;
            }
            if (rating<minRating){
                minRating = rating;
                minratingName = name;
            }
            counter += rating;
        }
        avgRating = counter / n;
        System.out.printf("%s is with highest rating: %.1f%n",maxratingName,maxRating);
        System.out.printf("%s is with lowest rating: %.1f%n",minratingName,minRating);
        System.out.printf("Average rating: %.1f%n",avgRating);
    }
}
