package patterns;
import java.util.Scanner;

public class charPattern3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int i = 1;

        while(i<=n){
            int j =1;
            int num = n;
            while(j<=i){
                System.out.print(((num-i)));
                num++;
                j++;
            }
            System.out.println();
            i++;
        }




        }
    }

