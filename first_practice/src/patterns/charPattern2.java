package patterns;
import java.util.Scanner;

public class charPattern2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n = sc.nextInt();
        int i = 1 ;
        while(i<=n){
            int j =1;
            while(j<=i){
                System.out.print((char)(64+i));
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
