package Arrays;
import java.util.Scanner;

public class SwapAlternates {
    public static void swapAlternate(int arr[]){

        if (arr.length%2==0){
            for (int i = 0;i<arr.length;i+=2){
                int temp = arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        if(arr.length%2!=0){
            for (int i = 0;i<arr.length-1;i+=2){
                int temp = arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;

            }
        }
    }
    public static int[] takingInput(){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int arr[] = new int [n];
        for (int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iteration = sc.nextInt();
        int[] arr= takingInput();
        swapAlternate(arr);
        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[i]);
        }


    }
}
