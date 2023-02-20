package Recursion;
import java.util.Scanner;
public class MergeSort {
    public static void mergeSort(int[] input){
        if(input.length<=1){
            return;
        }
        int arr1 [];
        int arr2 [];
        if(input.length % 2 ==0){
             arr1 = new int[input.length/2];
             arr2 = new int[input.length/2];
        }
        else{
            arr1  = new int[input.length/2];
            arr2  = new int[input.length/2 + 1];

        }
        for(int i =0;i<arr1.length;i++){
            arr1[i]=input[i];
        }
        for(int i =0;i<arr2.length;i++){
            arr2[i]=input[input.length/2 + i];
        }

        mergeSort(arr1);
        mergeSort(arr2);
        merge(input,arr1,arr2);

    }
    private static void merge(int []input,int arr1[],int arr2[]){

        int ans [] = new int[arr1.length+arr2.length];
        int i =0;
        int j =0;
        int k =0;
        while(i<arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {

                ans[k] = arr1[i];
                input[k] = arr1[i];
                i++;
                k++;

            }
            else{
                ans[k] = arr2[j];
                input[k] = arr2[j];
                j++;
                k++;
            }
        }
        while(i<arr1.length){
            ans[k]= arr1[i];
            input[k]= arr1[i];
            i++;
            k++;
        }
        while(j<arr2.length){
            ans[k]= arr2[j];
            input[k]= arr2[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i =0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        mergeSort(arr);
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
