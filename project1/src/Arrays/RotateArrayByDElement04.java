package Arrays;
import java.util.Scanner;
// well optimized without any error
public class RotateArrayByDElement04 {
    public static void rotate(int[] arr,int d) {
        for (int i = 0;i<arr.length/2;i++){
            int temp = arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        for (int i = 0;i<(arr.length-d)/2;i++){
            int temp = arr[i];
            arr[i]=arr[arr.length-d-i-1];
            arr[arr.length-d-i-1]=temp;
        }
        int j = 0;
        for (int i = arr.length-d;j<d/2;i++){
            int temp = arr[i];
            arr[i]=arr[arr.length-1-j];
            arr[arr.length-1-j]=temp;
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
