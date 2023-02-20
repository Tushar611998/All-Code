package ifElse;
import java.util.Scanner;

public class checkYearIsLeapOrNot {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int year = sc.nextInt();

        String result =(year%4 == 0)? "year is leap year" : "year is not leap year";
        System.out.println(result);


    }
}
