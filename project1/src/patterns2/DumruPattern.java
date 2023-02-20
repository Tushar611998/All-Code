package patterns2;
import java.util.Scanner;

public class DumruPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j < i) {
                System.out.print(" ");
                j++;
            }
            j = n - i + 1;
            while (j > 0 && j <= n - i + 1) {
                System.out.print("*");
                j--;
            }
            j = n - i;
            while (j > 0) {
                System.out.print("*");
                j--;
            }
            System.out.println();
            i++;


        }
        i = 1;
        while (i <= n) {
            int j = n-i;
            while (j <= n - i && j>0) {
                System.out.print(" ");
                j--;
            }
            j=1;
            while(j<=i){
                System.out.print("*");
                j++;
            }
            j=1;
            while(j<i){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
