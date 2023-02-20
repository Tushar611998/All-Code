package Arrays;
import java.util.Scanner;
//it takes more time to execute and sows TIME LIMIT EXCEEDED
public class RotateArrayByDElements02 {
    public static void rotate(int[] arr, int d) {
        int n = arr.length;
        while (d > 0) {
            int j = 0;
            int temp = arr[j];
            while (j < n - 1) {
                arr[j] = arr[j + 1];
                j++;
            }
            arr[arr.length - 1] = temp;
            d--;
        }
    }

    public static int[] takingInput() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iteration = sc.nextInt();
        for (int s = 0; s < iteration; s++) {


            int arr[] = takingInput();
            int d = sc.nextInt();
            rotate(arr, d);

            for (int k = 0; k < arr.length; k++) {
                System.out.print(arr[k] + " ");
            }
            System.out.println();

        }
    }
}
