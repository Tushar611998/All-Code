package Arrays;
import java.util.Scanner;
public class PushZeroAtLast1 {
    // this progtram is perfect the only problem is it  takes  more time to execute and exceeded the time limit
    // it shows LTE error means TIME LIMIT EXCEEDED
    public static void pushZerosAtEnd(int[] arr) {
        int n = arr.length;
        int zero = arr.length - 1;

        for (int i = 0; i < n; i++) {
            int temp = arr[i];

            for (int j = i + 1; j < n; j++) {

                if (arr[j] == 0 && arr[i] == 0) {
                    continue;
                } else if (arr[j] != 0 && arr[i] == 0) {
                    arr[i] = arr[j];
                    arr[j] = temp;
                    break;
                }

            }
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
            pushZerosAtEnd(arr);

            for (int k = 0; k < arr.length; k++) {
                System.out.print(arr[k] + " ");
            }
            System.out.println();

        }
    }
}

