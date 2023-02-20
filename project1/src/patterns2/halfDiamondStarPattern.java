package patterns2;
import java.util.Scanner;
public class halfDiamondStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = 1;
        while(i<=n){
            int j = 1;
            while(j<=i){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
        i = n+1;


        while(i>0) {
            int j = 1;
            while (j<=i) {
                System.out.print("*");

                j++;
            }

            System.out.println();
            i--;
        }
    }
}
