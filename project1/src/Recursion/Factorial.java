package Recursion;
import java.util.Scanner;
public class Factorial {

    public static int Factorial(int n){
        if(n==0){
            return 1;
        }
        int smallprob = Factorial(n-1);
        return n * smallprob;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans =Factorial(n);

        System.out.println(ans);
    }
}
