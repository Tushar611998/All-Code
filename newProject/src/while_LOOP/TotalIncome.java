package while_LOOP;
import java.util.Scanner;
public class TotalIncome {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int basic = sc.nextInt();
        char grade = sc.next().charAt(0);

        int allow = 0;
        //hra   = 20% of basic
        //da    = 50% of basic
        //allow = 1700 if grade = ‘A’
        //allow = 1500 if grade = ‘B’
        //allow = 1300 if grade = ‘C' or any other character
        //pf    = 11% of basic.

        double hra = 0.2*basic;
        double da =  0.5*basic;
        double pf =  0.11*basic;


        if (grade=='A'){
            allow = 1700;
        }
        else if (grade=='B'){
            allow = 1500;
        }
        else if (grade == 'C'){
            allow = 1300;
        }
        else{
            allow = 1300;
        }

        // formula=
        //totalSalary = basic + hra + da + allow – pf
        double totalsalary = basic+hra+da+allow-pf;


        System.out.format("%.0f",totalsalary);


    }
}
