package patterns2;
import java.util.Scanner;

public class SpecialPattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int i = 1;

        while(i<=n){
            int j =1;
            int num =0;
            while(j<=n-i){
                System.out.print(" ");
                j++;
            }
            j=1;
            while(j<=i){
                System.out.print(num+i);
                num++;
                j++;
            }
            j=i;
            while(j>1){
                System.out.print(j+i-2);

                j--;
            }
            System.out.println();
            i++;
        }
    }
}
