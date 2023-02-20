package Arrays;
import java.util.Scanner;
public class SelectionSort {
    public static int[] takingInput() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();

        }
        return arr;
    }

    public static void selectionSort(int arr[]) {
        for (int i = 0;i<arr.length-1;i++){
            int min = arr[i];
            int minIndex = i;

            for (int j = i+1;j<arr.length;j++){
                if (min>arr[j]){
                    min=arr[j];
                    minIndex=j;
                }
                else{
                    continue;
                }
            }
            if (minIndex!=i) {
                arr[minIndex] = arr[i];
                arr[i] = min;
            }


        }
    }
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int iteration = sc.nextInt();
        int arr[] = takingInput();
        selectionSort(arr);
        for (int k =0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }


    }
}

