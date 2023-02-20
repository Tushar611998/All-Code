package Recursion;
import java.util.Scanner;
public class mergeSort2 {

    // here this problem will mergesort the array without creating new arrays hence it requires less space

    public static void mergeSort(int[] input,int si,int ei){
        if(si>=ei){
            return;
        }
       int mid = (si+ei)/2;

        mergeSort(input,si,mid);
        mergeSort(input,mid+1,ei);
        merge(input,si,ei);

    }
    private static void merge(int []input,int si,int ei){

        int mid = (si+ei)/2;

        int ans [] = new int[ei-si+1];
        int i =si;
        int j =mid+1;
        int k =0;
        while(i<=mid && j <= ei) {
            if (input[i] <= input[j]) {

                ans[k] = input[i];
                i++;
                k++;

            }
            else{
                ans[k] = input[j];
                j++;
                k++;
            }
        }
        while(i<=mid){
            ans[k]= input[i];
            i++;
            k++;
        }
        while(j<=ei){
            ans[k]= input[j];
            j++;
            k++;
        }
        for(int index =0;index<ans.length;index++){
            input[si+index]= ans[index];
        }
        for(int d =0;d<ans.length;d++){
            System.out.print(ans[d]+" ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i =0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        mergeSort(arr,0,n-1);
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }



}
