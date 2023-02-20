package function;
import java.util.Scanner;

public class fibonacciNumberFunction {
    public static boolean checkMember(int n) {

        int i = 0;
        int j = 1;
        while (i < n) {

            int k = i + j;
            i = j;
            j = k;
        }
        if (i == n) {

            return true;
        } else {

            return false;
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean a=checkMember(n);
        System.out.println(a);
    }
}
