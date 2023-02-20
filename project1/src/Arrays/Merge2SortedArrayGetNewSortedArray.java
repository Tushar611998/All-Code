package Arrays;
import java.util.Scanner;
public class Merge2SortedArrayGetNewSortedArray {
    public static int[] merge(int[] arr1, int arr2[]) {
        int n = arr1.length + arr2.length;
        int arr3[] = new int[n];
        int i =0;
        int j =0;
        int count = 0;
        while(i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                arr3[count] = arr1[i];
                count = count + 1;
                i++;
            } else if (arr1[i] > arr2[j]) {
                arr3[count] = arr2[j];
                count = count + 1;

                j++;

            } else if (arr1[i] == arr2[j]) {
                arr3[count] = arr1[i];
                count = count + 1;
                arr3[count] = arr2[j];
                count = count + 1;

                i++;
                j++;

            }
        }

        while (j< arr2.length) {
            arr3[count] = arr2[j];
            count = count + 1;
            j++;
        }
        while (i< arr1.length ) {
            arr3[count] = arr1[i];
            count = count + 1;
            i++;
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
