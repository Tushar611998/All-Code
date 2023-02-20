package Recursion;
import java.util.Scanner;
public class BinarySearch {
    public static int binarySearch(int [] input,int element,int start,int end){

        if(start>=end){
            return -1;
        }
        int mid = (start+end)/2;

        if(input[mid]==element){
            return mid;
        }

        if(element< input[mid]){
            return binarySearch(input,element,start,mid-1);
        }
        else{
            return binarySearch(input,element,mid+1,end);
        }

    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int elemet = sc.nextInt();
        int ans = binarySearch(arr,elemet,0,arr.length-1);
        System.out.println(ans);
    }

}
