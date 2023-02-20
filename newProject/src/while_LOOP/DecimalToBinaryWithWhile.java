package while_LOOP;
import java.util.Scanner;

public class DecimalToBinaryWithWhile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n = sc.nextInt();
        int i = n;
        int pv = 1;
        int j =0;
        while(i>0){
            int q,r;
            r= i%2;
            j=j+r*pv;
            pv=pv*10;
            i=i/2;

        }
        System.out.print(j);
    }
}
