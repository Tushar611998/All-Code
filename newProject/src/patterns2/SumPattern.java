package patterns2;
import java.util.Scanner;
public class SumPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;


        while (i <= n) {
            int j = 1;
            int sum =0;

            while (j <= i) {

                System.out.print(j);
                sum = sum + j;

                if(j<i){
                    System.out.print("+");

                }
                j++;

            }
            System.out.println("="+sum);

            i++;
        }

    }
}
