package patterns2;
import java.util.Scanner;

public class DiamondOfStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);      // WRONG ANSEWR
        int n = sc.nextInt();                     // WRONG ANSEWR
        int i =1;                                 // WRONG ANSEWR


        while(i<=((n+1)/2)){
            int j = 1;
            while(j<=(((n+1)/2))-i){
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
        i = 1;
        while (i<=n-i){
            int j = 1;
            while(j<=i){
                System.out.print(" ");
                j++;

            }

            j=1;
            while(j++<=(n-i)-1){
                System.out.print("*");

                j++;
            }
            j=(i);
            while(j<=1){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;

        }



    }
}
