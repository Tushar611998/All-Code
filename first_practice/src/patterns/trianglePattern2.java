package patterns;
import java.util.Scanner;

public class trianglePattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;

        while(i<=n){
            int j = 1;
            int num = i;

            while(j<=i){
                System.out.print(num);
                num++;
                j++;

            }
            System.out.println();
            i++;
        }

    }
}
