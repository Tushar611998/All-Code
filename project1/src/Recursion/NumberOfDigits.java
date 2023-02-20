package Recursion;
import java.util.Scanner;
public class NumberOfDigits {

        public static int count(int n){

        if(n>0 && n<1){
            return 1;
        }
        int smallans =count(n/10);
        return 1+smallans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans =count(n);
        System.out.println(ans);
    }
}

