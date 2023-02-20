package Arrays;
import java.util.Scanner;

public class ArrangeArrayWithSingleFunction {
    public static void arrange(int[] arr, int n) {
        if (n % 2 != 0) {
            int val = 1;
            for (int i = 0; i <= (n - 1) / 2; i++) {
                arr[i] = val;
                val += 2;
            }
            val = n - 1;
            for (int i = (n + 1) / 2; i < n; i++) {
                arr[i] = val;
                val -= 2;
            }

        } else if (n % 2 == 0) {
            int val = 1;
            for (int i = 0; i <= (n - 1) / 2; i++) {
                arr[i] = val;
                val += 2;
            }
            val = n;
            for (int i = (n + 1) / 2; i < n; i++) {
                arr[i] = val;
                val -= 2;
            }
        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int iteration = sc.nextInt();

        int n = sc.nextInt();
        if(n==0){
            return;
        }

        int arr[] = new int[n];
        arrange(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }


    }
}
