package Recursion;
import java.util.Scanner;
public class MultiplicationOf2Num {

    // here we have to use only subtraction and addition no other operations are allowed

    public static int MultiplicationOf2Num(int m ,int n){
        if(m==0){
            return 0;
        }

        int smallans = MultiplicationOf2Num(m-1,n);
        return n+smallans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int ans = MultiplicationOf2Num(m,n);
        System.out.println(ans);
    }
}
