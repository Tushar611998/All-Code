package ForLoop;
import java.util.Scanner;
public class PrintSequenceHackerRank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
// print the sequence Hacker rank problem (a+2^0*b),(a+2^0*b+ 2^1*b),
// (a+2^0*b+2^1*b+2^2*b),(a+2^0*b+2^1*b+2^2*b+2^3*b)..................
        for (int j = 0; j < k; j++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();

            int temp = b;
            int num = b;

            for (int i = 0; i < n; i++) {
                System.out.print(a + temp + " ");
                num = 2 * num;
                temp = temp + num;
            }
            System.out.println();
        }
    }

}




