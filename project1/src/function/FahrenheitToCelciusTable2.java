package function;
import java.util.Scanner;

public class FahrenheitToCelciusTable2 {
    public static void fahrenheittocelsius(int start, int end, int step) {
        while (start <= end) {
            System.out.println(start + " " + ((start - 32) * 5 / 9));
            start = start + step;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        int w = sc.nextInt();

        fahrenheittocelsius(s, e, w);
    }
}