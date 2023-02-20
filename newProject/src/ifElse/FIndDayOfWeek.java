package ifElse;
import java.util.Scanner;

public class FIndDayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();

        switch(day){
            case 1 -> System.out.println("monday");
            case 2 -> System.out.println("tuseday");
            case 3 -> System.out.println("wednseday");
            case 4 -> System.out.println("thurstday");
            case 5 -> System.out.println("friday");
            case 6 -> System.out.println("saturday");
            case 7 -> System.out.println("sunday");
            default -> System.out.println("not a day of week");
        }


    }
}
