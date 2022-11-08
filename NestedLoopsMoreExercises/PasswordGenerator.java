package NestedLoopsMoreExercises;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int l = Integer.parseInt(scan.nextLine());
        String password = "";

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 97; k < l + 97; k++) {
                    for (int m = 97; m < l + 97; m++) {
                        for (int o = 1; o <= n; o++) {
                            if (o > i && o > j) {
                                char g = (char) k;
                                char h = (char) m;
                                password = "" + i + j + g + h + o;
                                System.out.printf("%s ", password);
                            }
                        }
                    }
                }
            }
        }
    }
}
