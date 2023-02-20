package Arrays;
import java.util.Scanner;
public class SortZeroANdOnes {
    public static int[] takingInput() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        return arr;
    }

    public static void SortingZeroAndone(int arr[]) {
        int count =0;


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count = count + 1;

            } else if (arr[i] == 1) {
                continue;
            }
        }
        for(int j =0;j<count;j++){
            arr[j]=0;
        }
        for(int k =count;k<arr.length;k++){
            arr[k]=1;
        }
    }
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int iteration = sc.nextInt();
        int arr[] = takingInput();
        SortingZeroAndone(arr);

        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

