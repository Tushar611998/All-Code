package while_LOOP;
import java.util.Scanner;
public class PrintingAllPrimeNumbersTillN {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 2;
        while (i <= n) {
            int j = 1;
            int count = 0;
            while (j <= i) {

                if (i % j == 0) {
                    count = count + 1;
                }
                j++;
            }
            if (count == 2) {
                System.out.println(i);
            }

            i++;
        }


    }
}

