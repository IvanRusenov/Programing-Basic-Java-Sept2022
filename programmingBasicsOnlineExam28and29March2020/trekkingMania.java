package programmingBasicsOnlineExam28and29March2020;

import java.util.Scanner;

public class trekkingMania {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int groupCount = Integer.parseInt(scan.nextLine());

//        •	Група до 5 човека– Мусала
//•	Група от 6 до 12 – Монблан
//•	Група от 13 до 25 – Килиманджаро
//•	Група от 26 до 40 – К2
//•	Група от 41 или повече – Еверест
        int allPeople = 0;
        int musala = 0;
        int montblan = 0;
        int kilimandjaro = 0;
        int k2 = 0;
        int everest = 0;

        for (int i = 1; i <=groupCount ; i++) {
            int peoplesInGroup = Integer.parseInt(scan.nextLine());
            allPeople += peoplesInGroup;
            if(peoplesInGroup>=41){
                everest+=peoplesInGroup;
            } else if (peoplesInGroup >25) {
                k2+=peoplesInGroup;;
            } else if (peoplesInGroup > 12) {
                kilimandjaro+=peoplesInGroup;;
            } else if (peoplesInGroup > 5) {
                montblan+=peoplesInGroup;;
            } else if (peoplesInGroup <= 5) {
                musala+=peoplesInGroup;;
            }
        }
        double percentMusala = 1.0 * musala / allPeople * 100;
        double percentMontblan = 1.0 * montblan / allPeople * 100;;
        double percentKilimandjaro = 1.0 * kilimandjaro / allPeople * 100;;
        double percentK2 = 1.0 * k2 / allPeople * 100;;
        double percentEverest = 1.0 * everest / allPeople * 100;;

        System.out.printf("%.2f%%%n",percentMusala);
        System.out.printf("%.2f%%%n",percentMontblan);
        System.out.printf("%.2f%%%n",percentKilimandjaro);
        System.out.printf("%.2f%%%n",percentK2);
        System.out.printf("%.2f%%%n",percentEverest);


    }
}
