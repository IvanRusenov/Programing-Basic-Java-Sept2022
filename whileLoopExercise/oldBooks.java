package whileLoopExercise;

import java.util.Scanner;

public class oldBooks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String book = scan.nextLine();
        String searchingBook = scan.nextLine();
        int count = 0;
        while (!searchingBook.equals("No More Books")){
            if (book.equals(searchingBook)){
                break;
            }
            count++;
            searchingBook = scan.nextLine();
        }
        if (book.equals(searchingBook)){
            System.out.printf("You checked %d books and found it.",count);
        }else{
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.",count);
        }

    }
}
