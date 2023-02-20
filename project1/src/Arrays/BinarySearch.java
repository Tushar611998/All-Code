package Arrays;
import java.util.Scanner;
public class BinarySearch {
    public static int[] takingInput() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();

        }
        return arr;
    }

    public static int binarySearch(int arr[],int x) {
        int start = 0;
        int end =arr.length-1;


        while(start<=end){
            int mid = (start+end)/2;
            if (arr[mid]==x){
                return mid;
            }
            else if (arr[mid]<x){
                start = mid+1;
            }
            else if (arr[mid]>x){
                end =mid-1;
            }
        }
        return -1;

    }
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);


        int arr[] = takingInput();

        int iteration = sc.nextInt();

        int x = sc.nextInt();
        int j =binarySearch(arr,x);

        System.out.println(j);
    }
}
