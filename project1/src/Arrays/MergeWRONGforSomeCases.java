package Arrays;
import java.util.Scanner;

public class MergeWRONGforSomeCases {
    public static int[] merge(int[] arr1, int arr2[]) {
        int n = arr1.length + arr2.length;
        int count = 0;
        int num = 0;

        int arr3[] = new int[n];
        for (int i = 0; i < arr1.length; i++) {

            for (int j = num; j < arr2.length; j++) {
                if (arr1[i] < arr2[j]) {
                    arr3[count] = arr1[i];
                    count = count + 1;

                    break;
                } else if (arr1[i] > arr2[j]) {
                    arr3[count] = arr2[j];
                    count = count + 1;
                    num = num + 1;

                } else if (arr1[i] == arr2[j]) {
                    arr3[count] = arr1[i];
                    count = count + 1;
                    arr3[count] = arr2[j];
                    count = count + 1;
                    num = num + 1;

                    break;
                }
            }
            if (num > arr2.length - 1 && count < arr3.length) {
                arr3[count] = arr1[i];
                count = count + 1;
            }
        }

        while (num < arr2.length) {
            arr3[count] = arr2[num];
            count = count + 1;
            num = num + 1;
        }
        return arr3;
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
        for (int i = 0; i < iteration; i++) {
            int arr1[] = takingInput();
            int arr2[] = takingInput();

            int arr3[] = merge(arr1, arr2);

            for (int k = 0; k < arr3.length; k++) {
                System.out.print(arr3[k] + " ");
            }
            System.out.println();
        }
    }
}
