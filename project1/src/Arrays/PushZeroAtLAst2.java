package Arrays;
import java.util.Scanner;
// this is right aproach with less execution time
public class PushZeroAtLAst2 {
    public static void pushZerosAtEnd(int[] arr) {
        int n = arr.length;
        int i = 0;
        int j =0;
        while(i<n && j < n) {
            int temp = arr[i];
            if (arr[i] == 0) {
                i++;

            } else if (arr[i] != 0) {

                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            }
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println();

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



        }
    }
}


