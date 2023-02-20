package ForLoop;
import java.util.Scanner;
// this program only ignores last zeros and cosiders inbetween zeros.

public class ReverseNumberWithFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int rev =0;
        for(int i =n;i>0;i=i/10){
            int j = i%10;
            rev = (rev * 10)+j;

        }
        System.out.print(rev);
    }
}
