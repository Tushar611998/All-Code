package function;
import java.util.Scanner;

public class FahrenheitToCelsius {
    public static double ftoc(float n) {
        System.out.format("%.2f", ((n - 32) * 5 / 9));
        return n;
    }

    public static void main(String[] avgs) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        int w = sc.nextInt();


        while (s <= e) {
            System.out.print(s + " ");
            ftoc(s);
            System.out.println();
            s = s + w;
        }
    }
}
