package Recursion;
import java.util.Scanner;
public class CalculatePower {

    public static int power(int x,int n){
        if(n==1){
            return x;
        }
        int smallans = power(x,n-1);
        return x * smallans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int ans = power(x,n);
        System.out.println(ans);
    }
}
