package Recursion;
import java.util.Scanner;
public class FibonaciiNumber {

    public static int fibo(int n){
        if(n==0 || n ==1){
            return n;
        }

        return fibo(n-1) + fibo(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        int a = fibo(n);
        System.out.println(a);
//        0 1 1 2 3 5 8 13 21.....n
    }
}
