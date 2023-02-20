package Arrays;
import java.util.Scanner;
// well optimized without any error
public class RotateArrayByDElements03 {
    public static void rotate(int[] arr,int d) {
        int n = arr.length;
        if (arr.length==0){
            return;
        }

        int temp[] = new int [d];
        for(int i = 0;i<d;i++) {
            temp[i] = arr[i];
        }
        int j=0;
        int num = arr[j];
        while (j < n - d) {
            arr[j] = arr[j+d];
            j++;
        }
        j=0;

        for(int k = arr.length-d;k<arr.length;k++){

            arr[k]=temp[j];
            j++;

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
            rotate(arr,d);

            for (int k = 0; k < arr.length; k++) {
                System.out.print(arr[k] + " ");
            }
            System.out.println();

        }
    }

}
