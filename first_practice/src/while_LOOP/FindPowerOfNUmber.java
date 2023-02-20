package while_LOOP;
import java.util.Scanner;

public class FindPowerOfNUmber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int n = sc.nextInt();
        int i = 1;
        int multi = 1;

        while(i<=n){
            multi =multi * x;
            i=1+i;
        }
        System.out.println(multi);
    }
}
