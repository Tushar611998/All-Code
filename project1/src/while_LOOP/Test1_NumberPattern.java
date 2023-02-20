package while_LOOP;
import java.util.Scanner;

public class Test1_NumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i = 1;

        while(i<=n){
            int j = n-i;
            while( j>0){
                System.out.print(i+j);
                j--;
            }
            System.out.print("*");
            j=i-1;
            while(j<=i && j>0){
                System.out.print(j);
                j--;
            }
            System.out.println();

            i++;
        }
    }
}
