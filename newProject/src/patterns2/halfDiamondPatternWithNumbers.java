package patterns2;
import java.util.Scanner;
public class halfDiamondPatternWithNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n= sc.nextInt();
        int i = 1;
        System.out.println("*");

        while(i<=n){

            int j= 1 ;
            System.out.print("*");

            while(j<=i){

                System.out.print(j);
                j++;
            }
            j=i;
            while(j>1){
                System.out.print(j-1);
                j--;
            }
            System.out.println("*");
            i++;
        }
        i=n-1;
        while(i>0){
            System.out.print("*");
            int j= 1;
            while(j<=i){
                System.out.print(j);
                j++;
            }
            j=i;
            while(j>1){
                System.out.print(j-1);
                j--;
            }
            System.out.println("*");
            i--;
        }
        System.out.println("*");




    }
}

