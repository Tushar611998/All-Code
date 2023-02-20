package function;
import java.util.Scanner;
public class fibonaciiNumberCheck {
    public static boolean checkMember(int n) {

        int i = 0;
        int j = 1;
        while (i < n) {

            int k = i + j;
            i = j;
            j = k;
        }
        if (i == n) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();


        checkMember(s);
    }
}
