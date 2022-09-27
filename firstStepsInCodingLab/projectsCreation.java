import java.util.Scanner;

public class projectsCreation {

    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        int projectCount = Integer.parseInt(scan.nextLine());

        int projectsTime = projectCount * 3;

        System.out.printf("The architect %s " +
                "will need %d hours to complete %d project/s.",name,projectsTime,projectCount);



    }
}
