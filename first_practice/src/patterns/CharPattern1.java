package patterns;
import java.util.Scanner;
public class CharPattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;


        while(i<=n){
            int j =1;
            char num = (char)('A'+i);

            while(j<=i){
                System.out.print((char)(num-1));
                num++;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
