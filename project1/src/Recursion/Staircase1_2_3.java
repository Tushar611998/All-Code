package Recursion;
import java.util.Scanner;
public class Staircase1_2_3 {

    public static int staircase(int n ){

        if(n <0){
            return 0;
        }
        if(n==0){
            return 1;
        }

        int smallans = staircase(n-1);
         int smallcase1 = staircase(n-2);
         int smallcase2 = staircase(n-3);
         return smallans + smallcase1 + smallcase2;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int ans = staircase(n);
        System.out.println(ans);
    }
}
