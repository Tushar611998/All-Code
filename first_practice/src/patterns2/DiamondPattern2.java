package patterns2;
import java.util.Scanner;
public class DiamondPattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;

        while(i<=n){
            int j = i;
            while(j<=n){
                System.out.print(" ");
                j++;
            }
            j=1;
            while(j<=i){
                System.out.print("*");
                j++;
            }
            j=1;
            while(j<=i-1){
                System.out.print("*");
                j++;

            }
            System.out.println();
            i++;

        }
        while(i<=n*2+1){
            int j=1;
            while(j<=i-n-1){
                System.out.print(" ");
                j++;
            }
            j=i;
            while(j<=n*2+1){
                System.out.print("*");
                j++;
            }
            j=i;
            while(j<n*2+1){
                System.out.print("*");
                j++;

            }

            System.out.println();
            i++;
        }




    }
}




