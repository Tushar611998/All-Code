package Arrays;
import java.util.Scanner;
public class BubbleSort {
    public static void bubbleSort(int[] arr){
     for(int i =0;i<arr.length;i++){

        for(int j =0;j<arr.length-1;j++){
            int max = arr[j];
            int maxIndex= 0;
            int k =j+1;
            if (max>arr[k]){
                maxIndex=k;
                arr[j]=arr[k];
                arr[maxIndex]=max;
            }
            else{
                continue;
            }

        }
    }

}
    public static int [] takingInput(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for (int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int arr []=takingInput();
        bubbleSort(arr);
        for(int k =0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }


    }
}
