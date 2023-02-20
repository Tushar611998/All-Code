package while_LOOP;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i = 1;
        int multi=1;

        while (i <= 10 ) {
            multi = n * i;
            System.out.println(multi);
            i = i+1;


        }

    }
}
