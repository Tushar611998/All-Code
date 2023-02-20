package while_LOOP;
import java.util.Scanner;
// this program prints numbers with arithmatic progression of 3*N+2
// and ignores values which are divisible by 4.
public class _N3Plus2_WithWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        int count = 0;

        while (count < n) {
            i++;
            if ((3*i+2) % 4 == 0) {
                continue;
            }
            count = count + 1;
            System.out.println(3 * i + 2);
        }
    }
}
