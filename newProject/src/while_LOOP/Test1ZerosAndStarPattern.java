package while_LOOP;
import java.util.Scanner;

public class Test1ZerosAndStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i = 1;

        while(i<=n) {
            int j = 1;
            while (j <i) {
                System.out.print("0");
                j++;
            }

            System.out.print("*");
            j=1;
            while( j<=n-i){
                System.out.print("0");
                j++;
            }
            System.out.print("*");
            j =n-i;
            while(j>0 && j<=n-i){
                System.out.print("0");
                j--;

            }
            System.out.print("*");
            j=1;
            while(j<=i-1){
                System.out.print("0");
                j++;
            }
            System.out.println();

            i++;
        }
    }
}
