package while_LOOP;
import java.util.Scanner;

public class SumOfEvenANdOddInSameNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int E = 0;
        int o = 0;


        while (n > 0) {
            if ((n % 10) % 2 == 0) {
                E = E + (n % 10);
                n = n / 10;
            }
            if ((n % 10) % 2 != 0) {
                o = o + n % 10;
                n = n / 10;
            }

        }
        System.out.println(E + " " + o);

        }

    }

