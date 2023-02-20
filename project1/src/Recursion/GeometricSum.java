package Recursion;
import java.util.Scanner;
public class GeometricSum {

    // 1 + 1/2 + 1/4 + 1/8 + ... + 1/(2^k)

    public static double findGeometricSum(int k){
        if(k==0){
            return 1;
        }

        double smallans = findGeometricSum(k-1);
        return smallans+ Math.pow(0.5,k) ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double ans = findGeometricSum(n);
        System.out.printf("%.6f", ans);
    }
}
