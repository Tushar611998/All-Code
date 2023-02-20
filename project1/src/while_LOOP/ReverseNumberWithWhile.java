package while_LOOP;
import java.util.Scanner;
// this program only ignores last zeros and cosiders inbetween zeros.
public class ReverseNumberWithWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i =n;
        int rev =0;
        while(i>0){
            int j = i%10;


            rev = (rev * 10)+j;
            i=i/10;
        }
        System.out.print(rev);
    }
}
